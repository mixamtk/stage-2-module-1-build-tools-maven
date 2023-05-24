package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return (str != null) && str.matches("([1-9]\\d*)(\\.)?(\\d*)") && Double.parseDouble(str) > 0;
    }
}
