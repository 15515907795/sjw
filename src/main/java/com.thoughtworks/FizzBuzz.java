package com.thoughtworks;

public class FizzBuzz {
    public static String fizzBuzz(int num) {
        String str = "";
        String str3 = "Fizz";
        String str5 = "Buzz";
        String str7 = "Whizz";
        if(String.valueOf(num).contains("3")){
            return str3;
        }
        if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0) {
            return str3 + str5 + str7;
        }
        if (num % 3 == 0 && num % 5 == 0) {
            return str3 + str5;
        }
        if (num % 3 == 0 && num % 7 == 0) {
            return str3 + str7;
        }
        if (num % 5 == 0 && num % 7 == 0) {
            return str5 + str7;
        }
        if (num % 3 == 0) {
            return str3;
        }
        if (num % 5 == 0) {
            return str5;
        }
        if (num % 7 == 0) {
            return str7;
        }
        return String.valueOf(num);
    }

}
