package com.gau.dora.exam;

import com.gau.dora.exception.ExcelException;
import com.gau.dora.interfaces.CellParser;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.poi.ss.usermodel.Cell;

import java.util.Objects;

public class ParserInteger implements CellParser<Integer> {

    public Integer parser(String value, Cell cell, String errors) {
        return exc(value, String.format(errors, cell.getAddress()));
    }

    @Override
    public Integer parser(String value) {
        return Objects.nonNull(value) ? NumberUtils.toInt(value) : null;
    }

    @Override
    public Integer parser(String value, String sheetName, Cell cell, String errors) {
        return exc(value, sheetName + ":" + String.format(errors, cell.getAddress()));
    }

    private Integer exc(String value, String errors) {
        if(!NumberUtils.isDigits(value)) {
            throw new ExcelException(errors);
        }
        return NumberUtils.toInt(value);
    }
}
