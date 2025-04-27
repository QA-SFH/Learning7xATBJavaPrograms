package ex_25042025;

public class Lab073 {
    public static void main(String[] args) {
            String name1 = "Farhan"; //scp
            String name2 = "Farhan"; //scp
//          1

//            String name3 = new String("Farhan"); //heap
//            String name4 = new String("Farhan"); //heap
//          2
        // 3

        String name3 = new String("Farhan"); //heap

        System.out.println(name1 == name2);
        // check for ref
        System.out.println(name1.equals(name2));

        System.out.println(name1 == name3); // check for red
        System.out.println(name1.equals(name3)); // check for content



    }
}
