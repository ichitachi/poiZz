package com.gau.dora.bind.mapping;

import com.gau.dora.bind.PoiZzInputStream;
import com.gau.dora.bind.Unmarshaller;
import com.gau.dora.option.ExcelOptions;

public final class UnmarshallerHelper {

    public static Unmarshaller HSSFInstance(PoiZzInputStream<?> poiZzInputStream, ExcelOptions options) {
        return new UnmarshallerStream(poiZzInputStream, options);
    }

}
