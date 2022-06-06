package com.company;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String campus;
    private String room;
    private final int COUNT_FIELDS = 7;

    public boolean setAddressFromString(String str) {
        String[] strElements = str.trim().split("[' ']*,[' ']*");//обрезать пробелы
        // и разделить нужными пробелами и запятой - ", " - вот так
        if (strElements.length < COUNT_FIELDS) {//если все данные введены
            return false;
        }
        country = strElements[0];
        region = strElements[1];
        city = strElements[2];
        street = strElements[3];
        house = strElements[4];
        campus = strElements[5];
        room = strElements[6];
        return true;
    }

    public boolean setAddressFromStringWithAnySep(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",.;-");//задаем разделители
        if (stringTokenizer.countTokens() < COUNT_FIELDS) {//если разделителей меньше 7 выводим ложь
            return false;
        }
        country = stringTokenizer.nextToken().trim();//обрезаем поля от пробелов
        region = stringTokenizer.nextToken().trim();
        city = stringTokenizer.nextToken().trim();
        street = stringTokenizer.nextToken().trim();
        house = stringTokenizer.nextToken().trim();
        campus = stringTokenizer.nextToken().trim();
        room = stringTokenizer.nextToken().trim();
        return true;
    }

    public String toString() {
        return "Address(country=" + this.country + ", region=" + this.region + ", city=" + this.city + ", street=" + this.street + ", house=" + this.house + ", campus=" + this.campus + ", room=" + this.room + ")";
    }
}
