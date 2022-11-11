package com.john.exceptions.custom;

public class CustomExceptionTutorial {
    public static void main(String[] args) throws AgeLessThenZeroException {

//            validateAge(3);
            validateAge(-3);
    }

    private static void validateAge(int age) throws AgeLessThenZeroException {
        if (age < 0) {
//            throw new AgeLessThenZeroException("fgfg");
            throw new AgeLessThenZeroException("Oh no!",  new RuntimeException());
        }
    }

}
