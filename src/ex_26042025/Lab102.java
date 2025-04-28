package ex_26042025;

import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) {
//        Program to find if the number is positive or negative
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("It's a positive number");
        }else if(num<0) {
            System.out.println("It's a negative number4");
        }else{
            System.out.println("It's zero");
        }
    }
}
