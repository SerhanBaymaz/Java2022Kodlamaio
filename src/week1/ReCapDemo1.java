package week1;

import java.util.Scanner;
//what is the biggest number?
public class ReCapDemo1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = s.nextInt();
        System.out.print("Enter the second number:");
        int b = s.nextInt();
        System.out.print("Enter the third number:");
        int c = s.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("The biggest number is: " + max);


    }
}
