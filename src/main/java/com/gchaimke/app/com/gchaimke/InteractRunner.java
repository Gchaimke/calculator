package com.gchaimke;

import java.io.*;

/**
 * App calculator viewer
 */
class InteractRunner {
    public static void main(String[] arg) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first, second;
        String exit = "no";
        /*
		  try to take two numbers and do action with them
		 */
        try {
            Calculator calc = new Calculator();
			/*
			  Start loop
			 */
            while (!exit.equals("e")) {
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
				  calculate
				 */
                if (action.equals("+")) calc.add(first, second);
                if (action.equals("-")) calc.sub(first, second);
                if (action.equals("*")) calc.mult(first, second);
                if (action.equals("/")) calc.div(first, second);
				/*
				  output
				 */
                System.out.println(first + action + second + "=" + calc.getResult());
                System.out.print("Exit(e),Continue({Enter}),Clean(d) : ");
                exit = reader.readLine();
                if (exit.equals("d")) calc.clearResult();
            }
        } catch (Exception e) {
            System.out.println("Input error, please try one more time.");
        }
    }
}

