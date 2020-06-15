package com.thoughtworks;

public class FizzBuzz {
    public static String fizzBuzz(int num) {
        String str="";
        String str3="Fizz";
        if (num % 3==0){
            return str3;
        }
        return String.valueOf(num);
    }

}
