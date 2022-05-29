package com.company;

public class StringServicefor6 {

    public static void stringOperations (String str) {
        System.out.println("Last char value: " + str.charAt(str.length() - 1));
        System.out.println("String ends with substring \"!!!\": " + str.endsWith("!!!"));
        System.out.println("String starts with substring \"I like\": " + str.startsWith("I like"));
        System.out.println("String contains substring \"Java\": " + str.contains("Java"));
        System.out.println("Position of substring \"Java\": " + str.indexOf("Java"));
        System.out.println("Replace all 'a' to 'o': " + str.replaceAll("a", "o"));
        System.out.println("String in upper case: " + str.toUpperCase());
        System.out.println("String in lower case: " + str.toLowerCase());
        int position = str.indexOf("Java");
        System.out.println("Substring \"Java\": " +
                str.substring(
                        position == -1 ? 0 : position,
                        position == -1 ? 0 : position + "Java".length())
        );
    }

}
