package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

    /*    System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subAFromB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB); */

        System.out.println();

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Text example", poem -> poem.toUpperCase());
        poemBeautifier.beautify("Text example", poem -> "ABC " + poem + " ABC");
        poemBeautifier.beautify("Text example", poem -> poem.toLowerCase());
        poemBeautifier.beautify("Text example", poem -> poem + " number 1");
    }
}