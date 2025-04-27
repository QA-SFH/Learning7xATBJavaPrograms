package ex_25042025;

public class Lab055 {
    public static void main(String[] args) {
//        Type casting - source and destination conversion
        //        Widening - no data loss
        //        Narrowing - data loss
//        Widening
        byte b = 10;
        int i = b; // implicit casting
        System.out.println(i);

//        Narrowing
        int val = 300;
//        byte b1 = val;
        byte b1 = (byte)val; // explicit casting
        System.out.println(b1);

    }
}
