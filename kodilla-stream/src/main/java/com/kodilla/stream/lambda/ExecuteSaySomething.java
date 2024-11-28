package com.kodilla.stream.lambda;

import java.lang.reflect.Executable;

public class ExecuteSaySomething implements Executor {

    @Override
    public void process() {
        System.out.println("This is an example text.");
    }
}
