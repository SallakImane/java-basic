package com.imane;

import org.apache.commons.text.RandomStringGenerator;

public class RandomString {
    public static void main(String[] args) {
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
            .withinRange('0', 'z')
            .build();

        System.out.print(generator.generate(Integer.parseInt(args[0])));

    }
}