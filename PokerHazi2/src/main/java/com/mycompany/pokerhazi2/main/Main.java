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
        tests.add("1,4");
        tests.add("3,-1,2,-7,5");
        tests.add("1,4,10,22,30");

        for (String test : tests) {
            System.out.println("\"" + test + "\" --> " + StringCalculator.add(test));
        }

        System.out.println("\"1:2:3:4\" --> " + StringCalculator.add("1:2:3:4", ":"));
    }
}
