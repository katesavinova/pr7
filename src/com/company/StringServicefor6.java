package com.company;

public class StringServicefor6 {

    public static void stringOperations (String str) {
        System.out.println("Распечатать последний символ строки: " + str.charAt(str.length() - 1));
        System.out.println("Проверить, заканчивается ли ваша строка подстрокой \"!!!\": " + str.endsWith("!!!"));
        System.out.println("Проверить, начинается ли ваша строка подстрокой  \"I like\": " + str.startsWith("I like"));
        System.out.println("Проверить, содержит ли ваша строка подстроку \"Java\": " + str.contains("Java"));
        System.out.println("Найти позицию подстроки \"Java\": " + str.indexOf("Java"));
        System.out.println("Заменить все символы  'a' на 'o': " + str.replaceAll("a", "o"));
        System.out.println("Преобразуйте строку к верхнему регистру: " + str.toUpperCase());
        System.out.println("Преобразуйте строку к нижнему регистру: " + str.toLowerCase());
        int position = str.indexOf("Java");
        System.out.println("Вырезать строку Java c помощью метода String.substring() \"Java\": " +
                str.substring(
                        position == -1 ? 0 : position,
                        position == -1 ? 0 : position + "Java".length())
        );
    }

}
