package com.company;

public class Shirt {
    private String id;
    private String description;
    private String color;
    private String size;

    public Shirt(final String inputShirt) throws ShirtException {
        if (inputShirt == null || inputShirt.isEmpty()) {
            throw new ShirtException("Incorrect input!", inputShirt);
        }
        final String[] shirtInfo = inputShirt.split(", ");
        if (shirtInfo.length != Shirt.class.getDeclaredFields().length) {
            throw new ShirtException("Some field isn't exist!", inputShirt);
        }
        this.id = shirtInfo[0];
        this.description = shirtInfo[1];
        this.color = shirtInfo[2];
        this.size = shirtInfo[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
