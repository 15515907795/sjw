package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_number_one() {
        //given
        int num = 1;
        //when
        String result = FizzBuzz.fizzBuzz(num);
        //then
        assertEquals("1", result);
    }
}
