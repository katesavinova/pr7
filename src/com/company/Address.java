package com.company;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String section;
    private String apartment;

    public Address(final String input, final String regex) {
        if (input != null && !input.isEmpty()) {
            final String[] splitAddress = input.split(regex);
            if (splitAddress.length != 7) {
                throw new AddressException("Some field isn't exist!", input);
            }
            country = splitAddress[0];
            region = splitAddress[1];
            city = splitAddress[2];
            street = splitAddress[3];
            house = splitAddress[4];
            section = splitAddress[5];
            apartment = splitAddress[6];
        } else {
            throw new AddressException(input);
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "Страна = '" + country + '\'' +
                ", регион = '" + region + '\'' +
                ", город = '" + city + '\'' +
                ", улица = '" + street + '\'' +
                ", дом = '" + house + '\'' +
                ", корпус = '" + section + '\'' +
                ", офис = '" + apartment + '\'' +
                '}';
    }
}
