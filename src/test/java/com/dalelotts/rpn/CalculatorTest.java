package com.dalelotts.rpn;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author Dale "Ducky" Lotts
 * @since 10/27/15.
 */

public class CalculatorTest {

    private Calculator calculator;
    private static final String NEW_LINE = System.getProperty("line.separator");

    @Test
    public void runShouldDoTheRightThing() throws Exception {



        final InputStream inputStream = IOUtils.toInputStream("1\n", "UTF-8");
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        final PrintStream printStream = new PrintStream(outputStream);
        // When splitting strings be sure to be operating system independent.


        calculator = new Calculator(new Scanner(inputStream), printStream);
        calculator.run();

        final String[] strings = outputStream.toString().split(NEW_LINE);


        // Then
        // How can we make sure the calculator did the right thing?
        assertThat("1", equalTo(strings[2].toString()));

    }

}
