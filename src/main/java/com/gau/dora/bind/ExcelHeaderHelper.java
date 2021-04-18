package com.gau.dora.bind;

import com.gau.dora.interfaces.ExcelHeader;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExcelHeaderHelper {
    final Map<String, ExcelHeader> headers;

    public ExcelHeaderHelper(ExcelHeader[] excelHeaders) {
        this.headers = Collections.unmodifiableMap(Stream.of(excelHeaders)
                .collect(Collectors.toConcurrentMap(ExcelHeader::getHeader, Function.identity())));
    }

    public int size(){
        return headers.size();
    }

    public boolean isExists(String header) {
        return headers.containsKey(header);
    }

}
