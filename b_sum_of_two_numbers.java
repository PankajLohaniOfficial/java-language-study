import java.util.Scanner;

public class b_sum_of_two_numbers {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); //Here System.in means we want the input from the keyboard ....
        System.out.println("Enter the number a :");
        int a = sc.nextInt();

        System.out.println("Enter the number b :"); 
        int b = sc.nextInt();

        int sum = a+b; //Printing the Sum
        System.out.println("The sum of the Two numbers a and b is : " + sum);

        sc.close(); //use to close the scanner
}
}