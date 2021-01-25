package com.kevinten.senses.reactor;

public interface StreamLifecycle<V> {

    void onSuccess(StreamSource<V> streamSource);

    void onError(StreamSource<V> streamSource, Throwable throwable);
}
