package com.gau.dora.interfaces;

import org.apache.poi.ss.usermodel.Cell;

public interface CellParser<T>{
    T parser(String value);
    T parser(String value, Cell cell, String errors);
    T parser(String value, String sheetName, Cell cell, String errors);
}
