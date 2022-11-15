package com.gau.dora;


import com.gau.dora.annotations.ExcelCell;
import com.gau.dora.annotations.ExcelParser;
import com.gau.dora.annotations.ExcelSheet;
import com.gau.dora.bind.ExcelHeaderHelper;
import com.gau.dora.exam.User;
import com.gau.dora.interfaces.CellParser;
import com.gau.dora.interfaces.ExcelHeader;
import com.gau.dora.utils.RangeUtils;
import com.gau.dora.utils.ReflectUtils;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        // tesst merrg commit
        // tesst merrg commit
        // tesst merrg commit
        // tesst merrg commit
        // tesst merrg commit
        // tesst merrg commit
        // tesst merrg commit
        // tesst merrg commit
        // tesst merrg commit
        // tesst merrg commit
        // tesst merrg commit
        // tesst merrg commit
        // tesst merrg commit
        // tesst merrg commit
        // tesst merrg commit
        // tesst merrg commit
        User user = ReflectUtils.newInstanceOf(User.class);
        if(User.class.isAnnotationPresent(ExcelSheet.class)){
            ExcelSheet excelSheet = User.class.getAnnotation(ExcelSheet.class);
            Class<? extends ExcelHeader> clazz = excelSheet.headers();
            if(clazz.isEnum()) {
                ExcelHeaderHelper helper = new ExcelHeaderHelper(clazz.getEnumConstants());
                System.out.println(helper.size());
                System.out.println(helper.isExists("qử"));
            }
        }
        for (Field field : User.class.getDeclaredFields()) {

            if(field.isAnnotationPresent(ExcelParser.class)) {
                ExcelParser excelParser = field.getAnnotation(ExcelParser.class);
                CellParser<?> e = ReflectUtils.newInstanceOf(excelParser.clazz());
                field.setAccessible(true);
                Object value = e.parser("12");
                if(RangeUtils.validRange(field, user, value)) {
                    field.set(user, value);
                }
            }
        }
        System.out.println(user.getAge());
    }
}
