package ex_30042025;

public class Lab150 {
    public static void main(String[] args) {
//          String - immutable in nature
//        StringBuilder - StringBuffer

        String s1 = "Pramod";
        s1 = "Dutta";
        // change the value of string - Buffer
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");

        // Thead Safty?

        // stringBuilder - not thread safe - people LOVE it :)

    }
}
