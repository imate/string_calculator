package com.mycompany.pokerhazi2.main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author imate
 */
public class Main {

    public static void main(String... arg) {
        test();
    }

    private static void test() {
        List<String> tests = new ArrayList<>();
        tests.add("");
        tests.add("1");
        tests.add("2");

        for (String test : tests) {
            System.out.println("ˇ\""+test+"\" --> " + StringCalculator.add(test));
        }
    }
}
