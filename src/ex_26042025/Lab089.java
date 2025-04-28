package ex_26042025;

import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {
//            Grade calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark");
        int mark = sc.nextInt();

        if(mark>=80 && mark<=100){
            System.out.println('A');
        }else if(mark>=70 && mark <=79){
            System.out.println('B');
        }else if(mark>=60 && mark <=69){
            System.out.println('C');
        }else if(mark>=50 && mark <=59){
            System.out.println('D');
        }else if(mark <= -1 || mark>=100){
            System.out.println("Are you R");
        }else{
            System.out.println('F');
        }

    }
}
