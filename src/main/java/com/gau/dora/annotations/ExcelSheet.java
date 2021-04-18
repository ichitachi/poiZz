package com.gau.dora.annotations;

import com.gau.dora.interfaces.ExcelHeader;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface ExcelSheet {
    String value();
    Class<? extends ExcelHeader> headers();
}
