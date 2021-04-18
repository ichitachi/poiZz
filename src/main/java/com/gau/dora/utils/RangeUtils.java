package com.gau.dora.utils;

import com.gau.dora.annotations.Range;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.math.NumberUtils;

import java.lang.reflect.Field;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RangeUtils {
    public static <T> boolean validRange(Field field, T instance, Object value) {
        if(field.isAnnotationPresent(Range.class)) {
            Range range = field.getAnnotation(Range.class);
            int point = NumberUtils.toInt(String.valueOf(value));
            if(point >= range.min() && point <= range.max()) {
                return true;
            }
        }
        return false;
    }
}
