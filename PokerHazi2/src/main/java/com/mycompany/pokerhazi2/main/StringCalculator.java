package com.mycompany.pokerhazi2.main;

/**
 *
 * @author imate
 */
public class StringCalculator {

    private static final String DEFAULT_SEPARATOR = ",";
    
    public static int add(String numbers, String separator) {
        int sum = 0;
        String[] splitedStrings = numbers.split(separator);
        if (!numbers.equals("")) {
            for (String str : splitedStrings) {
                sum += Integer.parseInt(str);
            }
        }
        return sum;
    }

    public static int add(String numbers) {
        return add(numbers, DEFAULT_SEPARATOR);
    }
}
