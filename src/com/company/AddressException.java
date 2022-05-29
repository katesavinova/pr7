package com.company;

public class AddressException extends RuntimeException {
    private static final String defaultMessage = "Incorrect address!";

    public AddressException(final String message, final String input) {
        super(String.format("%s %s", message, input));
    }

    public AddressException(final String input) {
        this(defaultMessage, input);
    }
}
