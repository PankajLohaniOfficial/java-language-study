import java.util.Scanner; //This is used for the importing of the scanner class used for taking input..

public class a_taking_input_from_user {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); //Here System.in means we want the input from the keyboard ....
        System.out.println("Enter the number a :");
        int a = sc.nextInt();

        System.out.println("The inputed no. is : " + a);
        sc.close();
    }
}