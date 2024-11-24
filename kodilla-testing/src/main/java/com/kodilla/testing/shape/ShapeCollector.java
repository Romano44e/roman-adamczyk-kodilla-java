package com.kodilla.testing.shape;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapes = new ArrayList<Shape>();

    public ShapeCollector() {
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        shapes.remove(shape);
        return true;
    }

    public Shape getFigure(int shapeNumber) {
        if (shapeNumber >= 0 && shapeNumber < shapes.size()) {
            return shapes.get(shapeNumber);
        }
        return null;
    }

    public String showFigures() {
        String showFigures = "";
        for (Shape shape : shapes) {
            String shapeName = shape.getShapeName();
            showFigures = showFigures + shapeName + ", ";
        }
        return showFigures.substring(0, showFigures.length() - 2);
    }
}
