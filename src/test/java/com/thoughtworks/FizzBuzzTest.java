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
    @Test
    public void when_givin_3_should_return_Fizz() {
        //given
        int num = 3;
        //when
        String result = FizzBuzz.fizzBuzz(num);
        //then
        assertEquals("Fizz", result);
    }
    @Test
    public void when_givin_5_should_return_Buzz() {
        //given
        int num = 5;
        //when
        String result = FizzBuzz.fizzBuzz(num);
        //then
        assertEquals("Buzz", result);
    }
    @Test
    public void when_givin_7_should_return_Whizz() {
        //given
        int num = 7;
        //when
        String result = FizzBuzz.fizzBuzz(num);
        //then
        assertEquals("Whizz", result);
    }
}
