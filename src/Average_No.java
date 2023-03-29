import java.util.Scanner;

public class Average_No {

    public static void main(String[] args) {


        // create scanner class


        Scanner scanner = new Scanner(System.in);
       // create different variables

        System.out.println("Enter num 1");
        int num1 = scanner.nextInt();

        System.out.println("Enter num 2");
        int num2 = scanner.nextInt();

        System.out.println("Enter num 3");
        int num3 = scanner.nextInt();

        System.out.println("Enter num 4");
        int num4 = scanner.nextInt();

        System.out.println("Enter num 5");
        int num5 = scanner.nextInt();

           // print the average number by using user input number
        System.out.println("Average of five number is"  +  (num1 +num2+num3+num4+num5)/5);
}
}