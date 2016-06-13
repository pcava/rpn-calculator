/* See the file "LICENSE" for the full license governing this code. */
package com.dalelotts.rpn;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Implementation of a Reverse Polish Notation calculator.
 *
 * @author Dale "Ducky" Lotts
 * @since 10/27/15.
 */

final class Calculator {

	private Scanner scanner;
	private PrintStream output;

	public Calculator(Scanner scanner, PrintStream output)
	{
		this.scanner = scanner;
		this.output = output;
	}

	public void run() {

		output.println("Please enter values followed by operation symbols:");
		output.println("(Press CTRL+Z to end the program):");

		while (scanner.hasNext()) {
			final String tokenString = scanner.next();
			output.println(tokenString);
		}


	}
}

