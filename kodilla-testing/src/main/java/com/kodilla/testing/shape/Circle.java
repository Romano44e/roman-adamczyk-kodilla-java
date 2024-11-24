package com.kodilla.testing.shape;

import java.awt.*;

public class Circle implements Shape {

    private double radius;
    private String name;

    public Circle(double radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        double pi = 3.14159265358979323846;
        return pi * radius * radius;
    }
}
