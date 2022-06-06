package com.company;

import java.util.Locale;

public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String input) {
        final String[] array = input.split(" ");
        if (array.length > 0 && array.length < 4) {//полное имя три слова
            //substring - Возвращает строку, которая является подстрокой этой строки.
            // Подстрока начинается с указанного beginIndex и продолжается до символа с индексом endIndex - 1.
            // Таким образом, длина подстроки равна endIndex-beginIndex.
            //верхним регистром первая буква+ нижним регистром подстроку остальные буквы
            this.surname = array[0].substring(0, 1).toUpperCase(Locale.ROOT) + array[0].toLowerCase(Locale.ROOT).substring(1);
            if (array.length == 3) {
                this.name = array[1];
                this.patronymic = array[2];
            } else {
                this.name = null;
                this.patronymic = null;
            }
        } else {
            throw new RuntimeException("Incorrect input: " + input);
        }
    }

    public String getFullName() {
        String fullName = this.surname;
        if (this.name != null && this.patronymic != null) {
            return String.format(
                    "%s %s. %s.",
                    fullName,
                    this.name.substring(0, 1).toUpperCase(Locale.ROOT),
                    this.patronymic.substring(0, 1).toUpperCase(Locale.ROOT)
            );
        }
        return fullName;
    }
}
