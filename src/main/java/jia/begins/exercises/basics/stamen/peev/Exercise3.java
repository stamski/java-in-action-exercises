package jia.begins.exercises.basics.stamen.peev;

/**
 * Created by IntelliJ IDEA.
 * User: Stam
 * Date: 2010-11-15
 * Time: 12:54:30
 * To change this template use File | Settings | File Templates.
 */
public class Exercise3 {
    public static void main(String[] args)
    {
    int sum = 0;
        for (int i = 1; i<=1000; i++)
        {
            if(i%3==0 && i%5==0)
            {
            sum+=i;
            }
        }
    System.out.println("sumata na chislata ot 1 do 1000, koito se deliat ednovremenno na 3 i na 5 e: "+sum);
    }
}
