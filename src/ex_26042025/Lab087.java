package ex_26042025;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
//      max number in 2 inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter the number 1");
        int num2 = sc.nextInt();

//        System.out.println(Math.max(num1,num2));
//         if loop
        if(num1>num2){
            System.out.println(num1);
        }else if(num2>num1){
            System.out.println(num2);
        }else{
            System.out.println("Equal");
        }
    }
}
