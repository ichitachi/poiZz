package com.gau.dora.bind;

import java.io.File;
import java.io.InputStream;

public class PoiZzFile<T extends File> {

    private final T t;

    PoiZzFile(T t) {
        this.t = t;
    }

    /**
     * the T derived from {@link InputStream}
     * @return T
     */
    public T file() {
        return t;
    }
}
