package jia.exercises.basics.stamen.peev;
/**
 * Created by IntelliJ IDEA.
 * User: Stam
 * Date: 2010-11-10
 * Time: 14:29:07
 * To change this template use File | Settings | File Templates.
 */
import java.util.*;
import java.io.*;
public class Exercise1 {
    public static void main(String[] args) throws FileNotFoundException {
        File employees = new File("employees.txt");
        //PrintWriter writeInFile = new PrintWriter(employees);
        //s PrintWriter mi prezapisva faila vseki put i neznam kak da go opravq
        FileOutputStream writeInFile = new FileOutputStream(employees, true);
        Scanner in = new Scanner(System.in);
        String continueAdding;
        String EmployeesData = "";
            if (employees.length() < 1) {
                EmployeesData = String.format("%20s%20s%10s%20s%10s%n", "First Name", "Last Name", "Age", "Working Position", "Salary");
            }
        boolean stopAdding = false;
            while (!stopAdding){
                System.out.print(" Enter employee's first name: ");
                String firstName = in.next();
                System.out.print(" Enter employee's last name: ");
                String lastName = in.next();
                System.out.print(" Enter employee's age: ");
                String age = in.next();
                System.out.print(" Enter employee's working position: ");
                String workingPosition = in.next();
                System.out.print(" Enter employee's salary: ");
                String salary = in.next();
                EmployeesData += String.format("%20s%20s%10s%20s%10s%n",firstName,lastName,age,workingPosition,salary);
                System.out.print(" Do you want to add information about another employee? (y/n):");
                continueAdding = in.next();
                stopAdding = (!continueAdding.equals("y"));
            }
        new PrintStream(writeInFile).print(EmployeesData);
        //writeInFile.write(EmployeesData);
        //writeInFile.flush();
        // tezi 2 reda gore gi komentirah, zashtoto promenih parvonachalnia podhod
    }
}