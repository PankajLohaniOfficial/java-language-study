// Write a program to find out the type of website from the Url:-
// . com commertjal website
// . org organigation website
// . in Indian website


import java.util.Scanner;

public class g_ques_websiteType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter website URL: ");
        String url = sc.nextLine().toLowerCase();

        if (url.endsWith(".com")) {
            System.out.println("This is a Commercial website");
        } 
        else if (url.endsWith(".org")) {
            System.out.println("This is an Organization website");
        } 
        else if (url.endsWith(".in")) {
            System.out.println("This is an Indian website");
        } 
        else {
            System.out.println("Website type not recognized");
        }

        sc.close();
    }
}
