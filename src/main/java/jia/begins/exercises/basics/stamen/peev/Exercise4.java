package jia.begins.exercises.basics.stamen.peev;

import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: Stam
 * Date: 2010-11-15
 * Time: 12:55:05
 * To change this template use File | Settings | File Templates.
 */
public class Exercise4 {
    public static void main(String[] args) {
    BigInteger factorial=BigInteger.valueOf(1);
        for (int i=2; i<=100; i++)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("100! = "+factorial);
        String factorialString = factorial.toString();
        int factorialDigitsSum=0;
        char currentDigit;
        int currentDigitValue;
        for (int i=0; i<factorialString.length(); i++ )
        {
            currentDigit = factorialString.charAt(i);
            currentDigitValue = Character.getNumericValue(currentDigit);
            factorialDigitsSum+=currentDigitValue;
        }
        System.out.println("The sum of the digits in 100! = "+factorialDigitsSum);
    }
}
