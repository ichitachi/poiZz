package com.gau.dora.annotations;

import com.gau.dora.exam.StringParser;
import com.gau.dora.interfaces.CellParser;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface ExcelParser {
    Class<? extends CellParser<?>> clazz() default StringParser.class;
    String errors() default "";
}
