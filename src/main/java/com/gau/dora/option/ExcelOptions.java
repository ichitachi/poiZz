package com.gau.dora.option;

import lombok.*;

import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ExcelOptions {
    private String sheetName;
    private String startKeyWord;
    private String endKeyWord;
    private int startIndex;
    private int endIndex;
    private int headerIndex;
    Map<String, Set<? extends Object>> data;
    private int skip;
    private int limit;
    private int sheetIndex;
    private DateTimeFormatter dateFormatter;
    private DateTimeFormatter dateTimeFormatter;
    private int headerStart;
    private int headerCount;
    private boolean multiSheet;
    private boolean streams;
}
