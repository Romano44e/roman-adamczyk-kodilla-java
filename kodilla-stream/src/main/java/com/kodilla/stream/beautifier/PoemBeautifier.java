package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String poem, PoemDecorator poemDecorator) {
        String decorate1 = poemDecorator.decorate(poem);
        System.out.println(decorate1);
    }
}
