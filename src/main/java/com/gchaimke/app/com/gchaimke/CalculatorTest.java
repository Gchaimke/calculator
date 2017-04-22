package com.gchaimke;

/**
 * calculator test
 *
 * @author Chaim Gorbov
 * @since 22.04.2017
 */

class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.add(5, 5);
        if (calculator.getResult() == 10) {
            System.out.println("OK");
        } else {
            System.out.println("Try one more time");
        }
    }
}