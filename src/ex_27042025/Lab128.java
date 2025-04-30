package ex_27042025;

import java.util.Scanner;

public class Lab128 {
    public static void main(String[] args) {
//      coding program
//        factorial program
//        n = 5, 5*4*3*2*1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact = fact*i;
        }
        System.out.println(fact);
        sc.close();
    }
}
