package com.kodilla.testing.shape;

public class Square implements Shape {

    private double sideLength;
    private String name;

    public Square(double sideLength, String name) {
        this.sideLength = sideLength;
        this.name = name;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return sideLength*sideLength;
    }
}
