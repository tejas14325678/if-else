import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Inter_Changed_Value {

    static Scanner scanner = new Scanner(System.in);


    // x and y are to swap
    static int x,y,t;

    public static void main(String[] args) {

        System.out.println("Enter the value of X and Y");
        x=scanner.nextInt();
        y=scanner.nextInt();

        // call the int variable for printing the number
        System.out.println("before swapping numbers:"+x + "" + y);

        // swapping numbers by using the different variables

        t=x;
        x=y;
        y=t;

        System.out.println("After swapping:" +x +" " +y);
        System.out.println();


    }


}
