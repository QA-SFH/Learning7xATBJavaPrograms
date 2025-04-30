package ex_27042025;

public class Lab121 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50 ; i++) {
            System.out.println(i);
            if (i%2 == 0){
                System.out.println("even ->" + i );
                continue;
            }
            System.out.println("odd ->" + i);
        }
    }
}
