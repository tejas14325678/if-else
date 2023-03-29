import java.util.Scanner;

public class Eligible_for_vote {



    // create scanner class
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      // user are able to enter numbers


        System.out.println("Enter your age");

        int age = scanner.nextInt();
       // condition  for the vote users
        if (age>=18)

        {
            System.out.println("your are eligible for vote");

        }
         // if condition is not match than its print the below message
        else
        {
            System.out.println("your are not eligible for vote");
        }

    }
}
