package ex_30042025;

public class Lab141 {
    public static void main(String[] args) {
        final float pi = 3.14f;
        // Disadvantage of array
        //1. Fixed Data Type (homo)
        //2.  Fixed Length.
        // 3. wastage of memory

        int[] ages = new int[100];
        ages[5] = 99;

        for (int i = 0; i < ages.length ; i++) {
            System.out.println(ages[i]);
        }
    }
}
