package com.company;

public class DigitParser {
    private String countryCode;//код города
    private String phoneNumber;//номер телефона


    public DigitParser(String input) {
        this.phoneNumber = input.substring(input.length() - 10);//номер теелфона без учета 1й цифры
        System.out.println("Первый символ номера = " + input.charAt(0));//вывести первое число
        if (input.charAt(0) == '8') {//если первая 8, пишем код 7
            this.countryCode = "7";
        } else {
            this.countryCode = input.substring(1, input.length() - 10);//иначе первый символ номера
        }
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void printPhoneNumber() {
        //+код(3цифры)-3цифры-4цифры
        System.out.printf(
                "\n+%s(%s)-%s-%s",
                this.countryCode,
                this.phoneNumber.substring(0, 3),
                this.phoneNumber.substring(3, 6),
                this.phoneNumber.substring(6, 10));
    }

    @Override
    public String toString() {
        return "DigitParser{" +
                "countryCode='" + countryCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
