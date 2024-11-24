package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double baseLength;
    private double height;
    private String name;

    public Triangle(double baseLength, double height, String name) {
        this.baseLength = baseLength;
        this.height = height;
        this.name = name;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return baseLength * height * 0.5;
    }
}
