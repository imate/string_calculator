package com.mycompany.pokerhazi2.main;

/**
 *
 * @author imate
 */
public class StringCalculator {

    private static final String DEFAULT_SEPARATOR = ",";

    public static int add(String numbers, String separator) {
        int sum = 0;
        int actNum;
        String errorMessage = "Negatives not allowed: ";
        boolean negativeError = false;
        try {

            String[] splitedStrings = numbers.split(separator);
            if (!numbers.equals("")) {
                for (String str : splitedStrings) {
                    actNum = Integer.parseInt(str);
                    sum += actNum;
                    if (actNum < 0) {
                        negativeError = true;
                        errorMessage += actNum + ", ";
                    }
                }
                errorMessage = errorMessage.substring(0, errorMessage.length() - 2);
            }
            if (negativeError) {
                throw new Exception(errorMessage);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return sum;
    }

    public static int add(String numbers) {
        return add(numbers, DEFAULT_SEPARATOR);
    }
}
