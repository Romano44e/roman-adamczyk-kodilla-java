package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEachTest() {
        testCounter++;
        System.out.println("test number " + testCounter);
    }


    @Nested
    @DisplayName("Tests for squares")
    class TestSquares {
        @Test
        void testAddSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(2, "square1");
            //When
            shapeCollector.addFigure(square);
            //Then
            Assertions.assertEquals(1, shapeCollector.shapes.size());
        }

        @Test
        void testRemoveSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(2, "square1");
            shapeCollector.addFigure(square);
            //When
            boolean result = shapeCollector.removeFigure(square);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.shapes.size());
        }

        @Test
        void testGetSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(2, "square1");
            shapeCollector.addFigure(square);
            //When
            Shape retrievedSquare = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(square, retrievedSquare);
        }

        @Test
        void testShowSquares() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(2, "square1");
            Square square2 = new Square(3, "square2");
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(square2);
            //When
            String showFigures = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals("square1, square2", showFigures);
        }
    }

    @Nested
    @DisplayName("Tests for circles")
    class TestCircles {
        @Test
        void testAddCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(2, "circle1");
            //When
            shapeCollector.addFigure(circle);
            //Then
            Assertions.assertEquals(1, shapeCollector.shapes.size());
        }

        @Test
        void testRemoveCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(2, "circle1");
            shapeCollector.addFigure(circle);
            //When
            boolean result = shapeCollector.removeFigure(circle);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.shapes.size());
        }

        @Test
        void testGetCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(2, "circle1");
            shapeCollector.addFigure(circle);
            //When
            Shape retrievedSquare = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(circle, retrievedSquare);
        }

        @Test
        void testShowCircles() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(2, "circle1");
            Circle circle2 = new Circle(3, "circle2");
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(circle2);
            //When
            String showFigures = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals("circle1, circle2", showFigures);
        }
    }

    @Nested
    @DisplayName("Tests for triangles")
    class TestTriangles {
        @Test
        void testAddTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(3, 2, "triangle1");
            //When
            shapeCollector.addFigure(triangle);
            //Then
            Assertions.assertEquals(1, shapeCollector.shapes.size());
        }

        @Test
        void testRemoveTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(3, 2, "triangle1");
            shapeCollector.addFigure(triangle);
            //When
            boolean result = shapeCollector.removeFigure(triangle);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.shapes.size());
        }

        @Test
        void testGetTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(3, 2, "triangle1");
            shapeCollector.addFigure(triangle);
            //When
            Shape retrievedSquare = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(triangle, retrievedSquare);
        }

        @Test
        void testShowTriangles() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(3, 2, "triangle1");
            Triangle triangle2 = new Triangle(4, 3, "triangle2");
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(triangle2);
            //When
            String showFigures = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals("triangle1, triangle2", showFigures);
        }
    }
}
