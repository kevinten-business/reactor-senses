package com.kevinten.senses.reactor;

import com.kevinten.senses.core.error.exception.StreamParamErrorCodeException;
import com.kevinten.vrml.error.ErrorObjects;
import com.kevinten.vrml.error.code.DefaultErrorCodes;
import reactor.core.publisher.Mono;

import java.util.function.Supplier;

public abstract class AbstractStreamPipeline<V, S> implements StreamPipeline<V, S> {

    @Override
    public Mono<Void> invoke(StreamContext<V, S> streamContext) {
        final StreamSource<V> source = streamContext.getStreamSource();
        ErrorObjects.requireNonNull(source, (Supplier<StreamParamErrorCodeException>) () -> new StreamParamErrorCodeException(DefaultErrorCodes.PARAMETER_ERROR));

        final StreamStages<S> stages = streamContext.getStreamStates();
        ErrorObjects.requireNonNull(stages, (Supplier<StreamParamErrorCodeException>) () -> new StreamParamErrorCodeException(DefaultErrorCodes.PARAMETER_ERROR));

        final StreamOp<V, S> streamOp = streamContext.getStreamOp();
        ErrorObjects.requireNonNull(streamOp, (Supplier<StreamParamErrorCodeException>) () -> new StreamParamErrorCodeException(DefaultErrorCodes.PARAMETER_ERROR));

        Mono<StreamSource<V>> mono = Mono.just(source);
        for (S nextState : stages) {
            mono = mono.flatMap(context -> streamOp.execute(source, nextState))
                    .doOnSuccess(streamOp::onSuccess)
                    .doOnError(throwable -> streamOp.onError(source, throwable));
        }

        mono
                .doOnSuccess(streamContext::onSuccess)
                .doOnError(throwable -> streamContext.onError(source, throwable))
                .subscribe();

        return mono.then();
    }
}
