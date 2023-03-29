import java.util.Scanner;


// this code is use for number is odd or even?

public class Odd_even {


    // by using scanner class user are able to write the number as per the user choice
    static Scanner scanner = new Scanner(System.in);


       //  call the main method to print the output
    public static void main(String[] args)
    {
        System.out.println("enter number");
        int number = scanner.nextInt();


        // check whether the number is even or odd


        if (number % 2 == 0)

            System.out.println(number + " is Even");
          // if the condition is not match than its print this " is odd "
        else
            System.out.println(number + " is odd");


    }


}
