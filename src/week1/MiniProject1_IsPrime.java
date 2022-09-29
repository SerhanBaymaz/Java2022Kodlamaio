package week1;

import java.util.Scanner;

public class MiniProject1_IsPrime {
    public static void main(String[] args) {
        //getting number from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int numberFromUser =scanner.nextInt();


        boolean isPrime = true;
        //control the number
        for (int i = 2; i < numberFromUser; i++) {
            if (numberFromUser%i ==0){
                isPrime=false;
            }
        }

        //print the screen.
        if (isPrime){
            System.out.println("Your number is prime number");
        }else{
            System.out.println("Your number is NOT prime number");
        }

    }
}
