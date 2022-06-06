package com.company;

public class MakeStringsfor7 {
//вернуть строку (число оператор число = результат)
    public static String getStringWith2Int (int integer1, int integer2, Operations operation) {
        return new StringBuilder()
                .append(integer1)
                .append(" ")
                .append(operation.getOperation())
                .append(" ")
                .append(integer2)
                .append(" = ")
                .append(operation.getOperationOf2Int(integer1, integer2))
                .toString();
    }

    public static String replaceEqualsCharByInsert(String str) {
        // Замените символ “=” на слово “равно”
        int index = str.indexOf("=");
        return new StringBuilder(str)
                .deleteCharAt(index)
                .insert(index, "равно")
                .toString();
    }
//Замените символ “=” на слово “равно”. Используйте методы
//StringBuilder.replace().
    public static String replaceEqualsCharByReplace (String str) {
        int index = str.indexOf("=");
        return new StringBuilder(str)
                .replace(index, index + 1, "равно")
                .toString();
    }

}
