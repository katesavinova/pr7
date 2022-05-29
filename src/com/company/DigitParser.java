package com.company;

public class DigitParser {
    private String countryCode;
    private String phoneNumber;


    public DigitParser(String input) {
        this.phoneNumber = input.substring(input.length() - 10);
        System.out.println("second = " + input.charAt(0));
        if (input.charAt(0) == '8') {
            this.countryCode = "7";
        } else {
            this.countryCode = input.substring(1, input.length() - 10);
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
        System.out.printf(
                "\n+%s(%s)-%s-%s\n",
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
