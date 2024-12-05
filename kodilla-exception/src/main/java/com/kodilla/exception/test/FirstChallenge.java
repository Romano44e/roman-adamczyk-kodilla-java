package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

//        try {
//            double v = a / b;
//            if (b == 0) {
//                throw new ArithmeticException();
//            }
//        } catch (ArithmeticException e) {
//            System.out.println("There is dividing by zero exception: " + e.getMessage());
//        } finally {
//            System.out.println("An attempt was made to divide two numbers.");
//        }
//        System.out.println("wynik dzielenia to: ");
//        return a / b;
//    }

    /**
     * This main can throw an ArithmeticException!!!
     *@param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("There is dividing by zero exception: " + e.getMessage());
        } finally {
            System.out.println("An attempt was made to divide two numbers.");
        }
    }
}
