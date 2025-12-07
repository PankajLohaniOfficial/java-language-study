// Write a program to calculate the percentage of a given student in the board exam. His marks are taken as input from the keyboard.

import java.util.Scanner;

public class c_question1 {
    public static void main( String[] args ){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the numbers of the 5 Subjects got on paper : ");
        double sub1 = sc.nextInt();
        double sub2 = sc.nextInt();
        double sub4 = sc.nextInt();
        double sub3 = sc.nextInt();
        double sub5 = sc.nextInt();

        double total_marks = sub1 + sub2 + sub3 + sub4 + sub5;
        double average_value = total_marks/500 ;
        double percentage = average_value * 100;

        System.out.println("The percentage of the given subject is : " + percentage);
        sc.close();
    }
}
