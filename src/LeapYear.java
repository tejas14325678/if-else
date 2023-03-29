import java.util.Scanner;

// check the year is leap or not?


public class LeapYear {


    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("enter year");
        int year = scanner.nextInt();

        // check of that 4 is divisible or not

        if (year%4==0)
        {
            System.out.println(year+ " is leap year");
        }
                // if condition is not match than its print the below print message
        else
        {

            System.out.println(year+" is not a leap year");
        }




    }

}
