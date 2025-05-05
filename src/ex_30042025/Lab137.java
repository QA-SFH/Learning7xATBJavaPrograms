package ex_30042025;

import java.util.Scanner;

public class Lab137 {
    public static void main(String[] args) {

//        Array - new
        int [] marks = new int[3];
//        index - 0,1,2
//        len - 3
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
//        Scanner sc = new Scanner(System.in);

//        marks[0] = sc.nextInt();

        marks[0] = 52;
        marks[1] = 52;
        marks[2] = 52;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        boolean[] is_married = {true,false,true};
//        to print

        String weekDays[] = {"Sunday","Monday","Friday"};
        for (int i = 0; i < marks.length ; i++) {
            System.out.println(weekDays[i]);
        }

    }
}
