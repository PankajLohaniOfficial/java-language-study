// Ques : Use the comparision operator to find out whether the given number is greater than the user entered number or not ....
import java.util.Scanner; // This is the compulsory importing for taking the input from the user...



public class e_questions_paper_ques1 {
    public static void main (String [] args){
        int given_number = 89;

        System.out.println("Enter the Number to be checked :- ");
        java.util.Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a > given_number){
            System.out.println("The Number is Greater than the Given Number -" + given_number);
        }
        else{
            System.out.println("Then number is Less than the Given Number...");
        }

        s.close();
    }
}
