package jia.begins.exercises.basics.stamen.peev;

/**
 * Created by IntelliJ IDEA.
 * User: Stam
 * Date: 2010-11-15
 * Time: 12:55:17
 * To change this template use File | Settings | File Templates.
 */

// broq na bukvite neobhodimi za izpisvaneto na 4islata ot 1 do 1000 na angliiski ezik
public class Exercise5 {
    public static void main(String[] args) {
        // from 1 to 9 ... [1,9]
        //
        // (3 times)3 letters: one, two, six
        // (3 times)4 letters: four, five, nine
        // (3 times)5 letters: three, seven, eight
        int from1to9 = (3*3)+(3*4)+(3*5);


        // from 10 to 19 ... [10,19]
        //
        // (1 time)3 letters: ten
        // (2 times)6 letters: eleven, twelve
        // (2 times)7 letters: fifteen, sixteen
        // (4 times)8 letters: thirteen, fourteen, eighteen, nineteen
        // (1 time)9 letters: seventeen
        int from10to19 = (1*3)+(2*6)+(2*7)+(4*8)+(1*9);


        // from 20 to 99 ... [20,99]
        //
        // tenths in the interval [20,99]
        // (3 times)5 letters: forty, fifty, sixty
        // (4 times)6 letters: twenty, thirty, eighty, ninety
        // (1 time)7 letters: seventy
        // Important: each tenth repeats 10 times
        int from20to99 = 3*(10*5+from1to9)+4*(10*6+from1to9)+1*(10*7+from1to9);


        //  from 100 to 999 ... [100,999]
        //
        // 7 letters: hundred
        // 3 letters: and
        // Important: "hundred" word repeats 100 times in each hundred
        // Important: "and" word repeats 99 times in each hundred
        // Important: there are 9 hundreds in [1,999]: 1,2,3,4,5,6,7,8,9
        // Important: each of the following words repeats 100 times (each word for each hundred): one, two, three, four, five, six, seven, eight, nine
        int from100to999 = 100*from1to9+9*(100*7+99*3+from1to9+from10to19+from20to99);

        // 1000
        //
        // 8 letters: thousand
        // Important: appears once
        int thousand = 8;

        // sum of all symbols
        int sum=from1to9+from10to19+from20to99+from100to999+thousand;
        System.out.println(sum);
    }
}

