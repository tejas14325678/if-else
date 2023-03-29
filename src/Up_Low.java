
import java.util.Scanner;

public class Up_Low {



    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       // change the alphabet from upper to lower


        System.out.println("enter alphabet");
        String Alpha = scanner.nextLine();
        String output = Alpha.toLowerCase(); // call the method to convert the alphabet in lowercase

        System.out.println(output);

    }
}
