package com.gau.dora.exam;

import com.gau.dora.interfaces.CellParser;
import org.apache.poi.ss.usermodel.Cell;

import java.util.Objects;

public class StringParser implements CellParser<String> {

    public String parser(String value, Cell cell, String errors) {
        return null;
    }

    @Override
    public String parser(String value) {
        return Objects.nonNull(value) ? value.trim() : null;
    }

    @Override
    public String parser(String value, String sheetName, Cell cell, String errors) {
        return null;
    }
}
