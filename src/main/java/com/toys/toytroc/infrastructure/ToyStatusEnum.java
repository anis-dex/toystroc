package com.toys.toytroc.infrastructure;

/**
 * toy status in the store
 */

public enum ToyStatusEnum {


    AVAILABLE("available"),

    PENDING("pending"),

    SOLD("sold");

    private String value;

    ToyStatusEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ToyStatusEnum fromValue(String text) {
        for (ToyStatusEnum b : ToyStatusEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
