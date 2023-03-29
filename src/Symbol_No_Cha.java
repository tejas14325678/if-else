import java.util.Scanner;

public class Symbol_No_Cha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any caracter");
        char cha = scanner.next().charAt(0);
        // if means the condition

        if ((cha >= 'a' && cha <='z') || (cha >= 'A' && cha <= 'Z'))  // char is a-z or A-Z then is alphabet
        {
            System.out.println(cha + " is a alphabet");
        } else if (cha >= '0' && cha <= '9')  // if is number than its print message "is a number"
        {
            System.out.println(cha + " is a number");
            
        }
        else
        {
            System.out.println(cha + " is a symbol");  // if user enter the symbol than its print message for symbol
        }
    }
}
