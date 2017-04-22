package com.gchaimke;

/**
 * calculator helper
 */
class Calculator{
	private int result=0;

	/**
	 * action plus
	 */
	 void add(int ... params){
			this.result = params[0] + params[1];
	}

	/**
	 * action subtract
	 */
	 void sub(int ... params){
			this.result = params[0] - params[1];
	}

	/**
	 * action multiply
	 */
	void mult(int... params){
		this.result = params[0] * params[1];
	}

	/**
	 * action divide
	 */
	void div(int ... params){
			this.result = params[0] / params[1];
	}

	/**
	 * get result
	 */
	 int getResult(){
		return this.result;
	}

	/**
	 * clear result
	 */
	 void clearResult(){
		this.result = 0;
	}
}