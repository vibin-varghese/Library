package com.cdl.java8.topics.vibin;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.cdl.java8.CheckString;

public class LambdaExpressionsTest {

    @Test
    public void testCheckStringTrue() {

        //Given
        final String text = "Vibin Varghese";
        CheckString checkString = name -> {
            return name instanceof String ? true : false;
        };

        //When
        boolean isString = checkString.checkIsString(text);

        //Then
        assertTrue(isString);
    }

    @Test
    public void testCheckStringFalse() {

        //Given
        final int text = 2;
        CheckString checkString = name -> {
            return name instanceof String ? true : false;
        };

        //When
        boolean isString = checkString.checkIsString(text);

        //Then
        assertFalse(isString);
    }

}
