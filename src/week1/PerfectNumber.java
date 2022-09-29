package week1;

import java.util.Scanner;
//for example : 28-> 1+2+4+7+14 = 28 is perfect number
public class PerfectNumber {
    public static void main(String[] args) {
        //Getting number from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number :");
        int numberFromUser = scanner.nextInt();


        boolean isPerfectNumber = false;
        int sum = 0;
        for (int i = 1; i <numberFromUser ; i++) {
                if (numberFromUser%i == 0){
                    sum+=i;
                }
                if (sum==numberFromUser){
                    isPerfectNumber=true;
                }
        }

        if (isPerfectNumber){
            System.out.println("Your number is perfect number");
        }else {
            System.out.println("Your number is NOTTTT perfect number");
        }

    }
}
