package jia.begins.exercises.basics.stamen.peev;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Stam
 * Date: 2010-11-15
 * Time: 12:57:08
 * To change this template use File | Settings | File Templates.
 */

// Zadacha inspirirana ot Exercise2
// Interesen i burz algorithm za namirane na sumata na estestwenite chisla ot 1 do tova, koeto se vuvede ot klaviaturata
// bez izpolzvaneto na cikal
// Moje dori da se prenapishe taka 4e da namira sumata ot estestvenite chisla mejdu 2 proizvolni estestveni 4isla
// bez da e zadaljitelno dolnata granica da e 1 (no v momenta ne go moje tova :) )

public class Exercise2_modified {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a natural number up to 2 147 483 646 (: ");
    String enteredNumber = in.next();
    Integer convertedNumber = Integer.parseInt(enteredNumber);
    BigInteger total;
        if ((convertedNumber%2)==0)
        {
        total = BigInteger.valueOf(convertedNumber+1);
        total = total.multiply(BigInteger.valueOf(convertedNumber/2));
        }
        else
        {
        total = BigInteger.valueOf(convertedNumber);
        total = total.multiply(BigInteger.valueOf((convertedNumber-1)/2));
        total = total.add(BigInteger.valueOf(convertedNumber));
        }
    System.out.print("The sum of the numbers between 1 and "+enteredNumber+" is: "+total);
    }
}
