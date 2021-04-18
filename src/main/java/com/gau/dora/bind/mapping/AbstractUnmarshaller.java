package com.gau.dora.bind.mapping;

import com.gau.dora.annotations.ExcelCell;
import com.gau.dora.bind.PoiZzFile;
import com.gau.dora.bind.Unmarshaller;
import com.gau.dora.option.ExcelOptions;
import com.gau.dora.utils.ReflectUtils;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

abstract class AbstractUnmarshaller implements Unmarshaller, PoiZzWorkBook {
    protected final ExcelOptions options;
    private final int limit;

    public AbstractUnmarshaller(ExcelOptions options) {
        this.options = options;
        this.limit = options.getLimit();
    }

    @Override
    public <T> void unmarshal(Class<T> type, Consumer<? super T> consumer, Function<? super T, ?> function) {
        T instance = ReflectUtils.newInstanceOf(type);
        Stream.of(type.getDeclaredFields())
                .filter(field -> field.isAnnotationPresent(ExcelCell.class))
                .forEach(field -> {
                    function.apply(instance);
        });
        consumer.accept(instance);
    }
}
