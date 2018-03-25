package com.example.akavall;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UtilsTest {
    @Test
    public void isPrime() throws Exception {
        boolean result = Utils.isPrime(13);
        boolean expectedResult = true;

        assertEquals(result, expectedResult);

    }
}
