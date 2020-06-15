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
    @Test
    public void when_givin_15_should_return_FizzBuzz() {
        //given
        int num = 15;
        //when
        String result = FizzBuzz.fizzBuzz(num);
        //then
        assertEquals("FizzBuzz", result);
    }
    @Test
    public void when_givin_21_should_return_FizzWhizz() {
        //given
        int num = 21;
        //when
        String result = FizzBuzz.fizzBuzz(num);
        //then
        assertEquals("FizzWhizz", result);
    }
    @Test
    public void when_givin_35_should_return_BuzzWhizz() {
        //given
        int num = 35;
        //when
        String result = FizzBuzz.fizzBuzz(num);
        //then
        assertEquals("BuzzWhizz", result);
    }
    @Test
    public void when_givin_105_should_return_FizzBuzzWhizz() {
        //given
        int num = 105;
        //when
        String result = FizzBuzz.fizzBuzz(num);
        //then
        assertEquals("FizzBuzzWhizz", result);
    }
}
