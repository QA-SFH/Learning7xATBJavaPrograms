package ex_25042025;

public class Lab057 {
    public static void main(String[] args) {
        int course = 100;
        float gst = 18.45F;
//        int total_price = course + gst;
        int total_price = course + (int)gst;
        System.out.println(total_price);
    }
}
