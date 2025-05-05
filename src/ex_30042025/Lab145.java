package ex_30042025;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab145 {
    public static void main(String[] args) {
//        Find the max in salary
//        find the max salary in the salary array

        int[] salaries = {7,10,4,13,25,30};
        int max = 1;
        for (int i = 0; i < salaries.length ; i++) {
            if(salaries[i]>max){
                max = salaries[i];
            }
        }
        System.out.println(max);
        Arrays.sort(salaries);
        System.out.println(salaries[salaries.length-1]);
    }
}
