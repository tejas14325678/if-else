import java.util.Scanner;

public class Add_Sub {

    public static void main(String[] args)

    { // calling scanner class
        Scanner scanner = new Scanner(System.in);

        // print number
        System.out.println("enter number 1");
        int no_1 = scanner.nextInt();

        System.out.println("enter number 2");
        int no_2 = scanner.nextInt();

      // print out put for the different calculation
        System.out.println(no_1+no_2);
        System.out.println(no_1*no_2);
        System.out.println(no_1/no_2);
        System.out.println(no_1-no_2);


    }
}
