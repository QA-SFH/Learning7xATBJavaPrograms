package ex_24042025;

public class Lab040 {
    public static void main(String[] args) {
        // compound assignment operator
        int a = 10;
        //+=,-=,/=,*=,%=
        int s1 = a+=10; //a=a+10
        int s2 =a-=10; //a=a-10
        int s3 =a/=10; //a=a/10
        int s4 =a*=10; //a=a*10
        int s5 =a%=10; //a=a%10
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
