package com.company;

import java.util.Locale;

public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String input) {
        final String[] array = input.split(" ");
        if (array.length > 0 && array.length < 4) {
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
