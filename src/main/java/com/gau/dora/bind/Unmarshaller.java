package com.gau.dora.bind;

import com.gau.dora.annotations.ExcelSheet;
import com.gau.dora.option.ExcelOptions;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public interface Unmarshaller {

    <T> void unmarshal(Class<T> type, Consumer<? super T> consumer, Function<? super T, ?> function);

    default <T> Optional<String> getSheetName(Class<T> type, ExcelOptions options) {
        if (type.isAnnotationPresent(ExcelSheet.class)) {
            ExcelSheet excelSheet = type.getAnnotation(ExcelSheet.class);
            String annotatedSheetName = excelSheet.value();
            return Optional.of(annotatedSheetName);
        }
        String configuredSheetName = options.getSheetName();
        return Optional.ofNullable(configuredSheetName);
    }
}
