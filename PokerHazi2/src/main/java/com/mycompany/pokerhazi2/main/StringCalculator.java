package com.mycompany.pokerhazi2.main;

/**
 *
 * @author imate
 */
public class StringCalculator {
    public static int add(String numbers){
        int sum=0;
        if(!numbers.equals("")){
            sum+=Integer.parseInt(numbers);
        }
        return sum;
    }
}
