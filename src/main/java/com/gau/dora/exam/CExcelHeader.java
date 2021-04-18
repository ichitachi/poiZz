package com.gau.dora.exam;

import com.gau.dora.interfaces.ExcelHeader;
import lombok.Getter;


@Getter
public enum  CExcelHeader implements ExcelHeader {
    $TITLE$("$title$"),
    $EFFECTIVE$("$effective$"),
    $EXPIRE$("$expire$"),
    $INFOCARD_TYPE$("$infocard_type$");
    private final String header;

    CExcelHeader(String header) {
        this.header = header;
    }
}
