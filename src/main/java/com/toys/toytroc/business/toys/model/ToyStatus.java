package com.toys.toytroc.business.toys.model;

public enum ToyStatus {

    AVAILABLE("available"),

    PENDING("pending"),

    SOLD("sold");

    private String value;

    ToyStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ToyStatus fromValue(String text) {
        for (ToyStatus b : ToyStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
