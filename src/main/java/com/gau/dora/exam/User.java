package com.gau.dora.exam;

import com.gau.dora.annotations.ExcelCell;
import com.gau.dora.annotations.ExcelParser;
import com.gau.dora.annotations.ExcelSheet;
import com.gau.dora.annotations.Range;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ExcelSheet(value = "users", headers = CExcelHeader.class)
public class User {
    @ExcelCell("AGE")
    @ExcelParser(clazz = ParserInteger.class, errors = "Son Test")
    @Range(min = 1, max = 100)
    int age;
    @ExcelCell("NAME")
    @ExcelParser
    String name;
}
