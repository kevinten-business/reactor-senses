package com.kevinten.senses.reactor;

import reactor.core.publisher.Mono;

public interface StreamPipeline<V, S> {

    Mono<Void> invoke(StreamContext<V, S> streamContext);
}
