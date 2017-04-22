package com.gchaimke;

/**
 * calculator helper
 */
class Calculator{
    private double result = 0;

    /**
	 * action plus
	 */

    void add(double... params) {
        this.result = params[0] + params[1];
    }

	/**
	 * action subtract
	 */
    void sub(double... params) {
        this.result = params[0] - params[1];
	}

	/**
	 * action multiply
	 */
    void mult(double... params) {
        this.result = params[0] * params[1];
	}

	/**
	 * action divide
	 */
    void div(double... params) throws UserException {
        if (params[0] != 0 && params[1] != 0) {
            this.result = params[0] / params[1];
        } else {
            throw new UserException("Can't divide by zero");
        }
    }

	/**
	 * get result
	 */
    double getResult() {
        return this.result;
	}

	/**
	 * clear result
	 */
	 void clearResult(){
		this.result = 0;
	}
}