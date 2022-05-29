package com.company;

public class StringServicefor9 {

    public static String get2CharFromString (String str) {
        if (str == null || str.length() % 2 != 0) {
            System.out.println("Invalid string!");
            return null;
        }
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

}
