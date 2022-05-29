package com.company;

public class MakeFormatStringfor10 {
    public static String getString (String lastName, int value, String subject) {
        return String.format("Студент %15s получил %3d по %10s", lastName, value, subject);
    }

}
