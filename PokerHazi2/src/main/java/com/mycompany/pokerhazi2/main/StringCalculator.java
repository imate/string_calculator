package com.mycompany.pokerhazi2.main;

/**
 *
 * @author imate
 */
public class StringCalculator {

    public static int add(String numbers) {
        int sum = 0;
        String[] splitedStrings = numbers.split(",");
        if (!numbers.equals("")) {
            for (String str : splitedStrings) {
                sum += Integer.parseInt(str);
            }
        }
        return sum;
    }
}
