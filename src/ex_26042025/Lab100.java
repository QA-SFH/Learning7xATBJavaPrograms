package ex_26042025;

import java.util.Scanner;

public class Lab100 {
    public static void main(String[] args) {
//         Write a program name,age,salary- print it
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name");
        String name = sc.next();

        System.out.println("Enter you age");
        int age = sc.nextInt();

        System.out.println("Enter you name");
        double salary = sc.nextDouble();

        System.out.println("Your name is "+ name);
        System.out.println("Your age is "+ age);
        System.out.println("Your salary is "+ salary);

        sc.close();

    }
}
