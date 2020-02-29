package com.antnzr.func.finalsection;

import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {
        Function<String, String> upperCaseName = name -> {
            if (name.isEmpty()) {
                throw new IllegalStateException("");
            }

            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Alex"));
    }
}