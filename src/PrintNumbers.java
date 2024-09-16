// This program takes the number from user and prints the number from zero to the
// number specified by the user.

import java.util.Scanner;

public class PrintNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = sc.nextInt();

        for(int i = 0; i<=number; i++){
            System.out.println(i);
        }
        sc.close();
    }
}
