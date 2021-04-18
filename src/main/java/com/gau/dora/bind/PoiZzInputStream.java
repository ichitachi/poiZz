package com.gau.dora.bind;

import java.io.InputStream;

public class PoiZzInputStream<T extends InputStream> {

    private final T t;

    PoiZzInputStream(T t) {
        this.t = t;
    }

    /**
     * the T derived from {@link InputStream}
     * @return T
     */
    public T stream() {
        return t;
    }
}
