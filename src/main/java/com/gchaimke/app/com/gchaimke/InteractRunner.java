package com.gchaimke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * App calculator viewer
 */
class InteractRunner {
    public static void main(String[] arg) throws UserException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double first, second;
        String exit = "no";
        Calculator calc = new Calculator();
        while (!exit.equals("e")) {
            try {
                /*
                  get first number
				 */
                if (calc.getResult() == 0) {
                    System.out.print("Enter first number : ");
                    first = Integer.parseInt(reader.readLine());
                } else {
                    first = calc.getResult();
                }

				/*
				  get action
				 */
                System.out.print("What to do ( + , - , * , / )  ");
                String action;
                action = reader.readLine();
				/*
				  get second number
				 */
                System.out.print("Enter second number : ");
                second = Integer.parseInt(reader.readLine());
				/*
                  action calculate
				 */
                if (action.equals("+")) calc.add(first, second);
                if (action.equals("-")) calc.sub(first, second);
                if (action.equals("*")) calc.mult(first, second);
                if (action.equals("/")) calc.div(first, second);
				/*
				  output
				 */
                System.out.println("Result : " + calc.getResult());
                System.out.print("Exit(e),Continue({Enter}),Clean result(d) : ");
                exit = reader.readLine();
                if (exit.equals("d")) calc.clearResult();

            } catch (Exception UserException) {
                System.out.println(UserException.getMessage());
            }
        }
    }
}

