package ex_30042025;

import java.util.Scanner;

public class Lab144 {
    public static void main(String[] args) {
//        where we take the user input of the 5 subjects and give them the avg marks
//        figure inputs - float scanner class

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        for (int i = 0; i < marks.length ; i++) {
            System.out.println("Enter the number" + ( i+1));
            marks[i] = sc.nextFloat();
        }

        for (int i = 0; i < marks.length ; i++) {
            System.out.println("Marks are" + (i+1) + "->" + marks[i]);
        }

        float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("Avg is ->" + avg);

        sc.close();
    }
}
