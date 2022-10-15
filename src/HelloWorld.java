
import java.util.*;
public class HelloWorld {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //System.out.println("Hello friend");
		/*Write a Java program to find student’s grade. Enter
		 *  student’s name and 3 subject’s marks. Calculate percentage.
		 *   And assign appropriate grade according to following conditions.
		a.	Per<=100 && per >=80 – A grade
		b.	Per <= 79 && per >=60 – B grade
		c.	Per <=59 && per >=50  - C grade
		d.	Per <=49 && per >= 40 – D grade
		e.	Per <= 39 && per >=0 – Fail*/

        Scanner sc = new Scanner(System.in);


        /*System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your marks");
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        if(mark1<0 || mark2<0 || mark3<0 || mark1>100 || mark2>100 || mark3>100) {
            System.out.println("Invalid No");
        }
        else {
            float total = (mark1+mark2+mark3)/3.0f;


            //float perc = (total*100)/300.0f;
            //System.out.println("percentage is "+perc);
            if(total>=80 && total<=100) {
                System.out.print("Grade is A");
                float perc = (total*100)/300;
                System.out.println(" and percentage is "+perc);
            }
            else if(total<=79 && total>=60) {
                System.out.print("Grade  is B");
                float perc = (total*100)/300.0f;
                System.out.println(" and percentage is "+perc);
            }
            else if(total<=59 && total>=40) {
                System.out.print("Grade  is B");
                float perc = (total*100)/300.0f;
                System.out.println(" and percentage is "+perc);
            }
            else System.out.println("Student has failed");

        }*/
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("It is valid for positive no");
        } else {
            for (int i = 2; i < n; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= 1;
            }
            System.out.println("factorial of a given no is " + fact);
            System.out.print("Table of a no is: ");
            for (int i = 1; i < 11; i++) {
                System.out.print(n * i+" ");

            }
        }
    }

}
