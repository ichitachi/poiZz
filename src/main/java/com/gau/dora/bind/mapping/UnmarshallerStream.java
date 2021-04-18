package com.gau.dora.bind.mapping;

import com.gau.dora.bind.PoiZzInputStream;
import com.gau.dora.exception.ExcelException;
import com.gau.dora.option.ExcelOptions;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.IOException;

public class UnmarshallerStream extends AbstractUnmarshaller {

    private final PoiZzInputStream<?> poiZzStream;

    public UnmarshallerStream(PoiZzInputStream<?> poiZzStream, ExcelOptions options) {
        super(options);
        this.poiZzStream = poiZzStream;
    }

    @Override
    public Workbook workbook() {
        try {
            return WorkbookFactory.create(poiZzStream.stream());
        } catch (IOException e) {
            throw new ExcelException("Problem occurred while creating HSSFWorkbook", e);
        }
    }
}
