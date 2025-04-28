package ex_26042025;

import java.util.Scanner;

public class Lab086 {
    public static void main(String[] args) {
//      Take a user input and check if the number is even or odd
//
//        Logic building
//        1.Figure out the inputs
//        Data type - int
//        scanner - class - to take input
//        nextInt() - > Input
//        2.data type
//        3.do we need conversion or directly
//        4.rough logic -> num%2 == 0 - even
//        5.optimize

        Scanner sc = new Scanner(System.in); // object of the scanner class - oops
        System.out.println("Enter the number 1");
        int user_input = sc.nextInt();
        System.out.println("Enter the number 2");
        int user_input2 = sc.nextInt();

        System.out.println(user_input);
        System.out.println(user_input2);

        if(user_input%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        if(user_input2%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
