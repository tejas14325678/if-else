import java.util.Scanner;

public class Pos_Neg_No {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int num = scanner.nextInt();



        // if the num is grater than zero then its print the positive if the condition
        if (num > 0)
        {
            System.out.println(num + " is positive No");
        } else if (num < 0)
        {
            System.out.println(num + " is negative No");
        } else
        {
            // if number is 0 than its print the message "is zero number"
            System.out.println(num + " is a zero No");
        }
    }
    }
