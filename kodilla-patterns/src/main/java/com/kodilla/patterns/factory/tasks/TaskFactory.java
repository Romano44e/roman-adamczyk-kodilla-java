package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task processTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("shopping for weekend", "eggs", 20);
            case PAINTING -> new PaintingTask("bedroom painting", "blue", "");
            case DRIVING -> new DrivingTask("driving with parents", "airport", "car");
            default -> null;
        };
    }

}
