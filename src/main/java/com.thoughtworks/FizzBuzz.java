package com.thoughtworks;

public class FizzBuzz {
    public static String fizzBuzz(int num) {
        String str = "";
        String str3 = "Fizz";
        String str5 = "Buzz";
        if (num % 3 == 0) {
            return str3;
        }
        if (num % 5 == 0) {
            return str5;
        }
        return String.valueOf(num);
    }

}
