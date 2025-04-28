package ex_26042025;

public class Lab099 {
    public static void main(String[] args) {
//        JDK 13
        char code = 'A';
        int val = switch (code){
            case 'A':
                yield 65;

            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
    }
}
