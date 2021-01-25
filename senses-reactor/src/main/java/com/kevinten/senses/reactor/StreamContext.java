package com.kevinten.senses.reactor;


public interface StreamContext<V, S> extends StreamLifecycle<V>{

    StreamSource<V> getStreamSource();

    StreamStages<S> getStreamStates();

    StreamOp<V, S> getStreamOp();
}
