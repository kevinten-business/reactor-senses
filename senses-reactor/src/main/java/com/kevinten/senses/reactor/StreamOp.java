package com.kevinten.senses.reactor;

import reactor.core.publisher.Mono;

public interface StreamOp<V, S> extends StreamLifecycle<V> {

    Mono<StreamSource<V>> execute(StreamSource<V> streamSource,
                                  S streamStage);
}
