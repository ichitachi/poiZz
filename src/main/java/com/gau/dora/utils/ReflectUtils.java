package com.gau.dora.utils;

import com.gau.dora.exception.ReflectInstantiationException;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.lang.reflect.Constructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class ReflectUtils {

    @SuppressWarnings("unchecked")
    public static <T> T newInstanceOf(Class<T> type) {
        try {
            Constructor<T> constructor = type.getDeclaredConstructor();
            if (!constructor.isAccessible()) {
                constructor.setAccessible(true);
            }
            return constructor.newInstance();
        } catch (Exception ex) {
            throw new ReflectInstantiationException("Cannot create a new instance of " + type.getName(), ex);
        }
    }
}
