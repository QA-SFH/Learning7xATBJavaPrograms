package ex_30042025;

public class Lab149 {
    public static void main(String[] args) {
//            String - bunch of char

        String s1 = new String("Farhan");// heap area
        String s2 = "Farhan";
//
//        String - immutable in nature
        System.out.println(s1.length());
        System.out.println(s1.indexOf("p"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());

    }
}
