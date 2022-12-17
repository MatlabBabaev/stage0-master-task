package com.epam.OOP;

public class Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public String getDescription(){
        return "This animal is mostly "
                .concat(this.color)
                .concat(". It has ")
                .concat(String.valueOf(this.numberOfPaws))
                .concat(numberOfPaws>1? " paws and":" paw and")
                .concat(hasFur ?" a fur.":" no fur.");
    }

}
