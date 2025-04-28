package ex_26042025;

public class Lab096 {
    public static void main(String[] args) {
//        JDK 13
        int itemcode = 003;
        switch (itemcode){
            case 001,002,003 :
                System.out.println("It's electric gadget");
                break;
            case 004,005,006 :
                    System.out.println("It's a wood");
                    break;
            default:
                System.out.println("It's a bat");
        }
    }
}
