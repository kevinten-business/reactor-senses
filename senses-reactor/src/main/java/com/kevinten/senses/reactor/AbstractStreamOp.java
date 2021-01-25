package com.kevinten.senses.reactor;

import reactor.core.publisher.Mono;

public abstract class AbstractStreamOp<V, S> implements StreamOp<V, S> {

    public static void main(String[] args) {
    }

    @Override
    public Mono<StreamSource<V>> execute(StreamSource<V> streamSource, S streamStage) {
        return null;
    }
}
