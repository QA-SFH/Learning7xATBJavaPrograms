package ex_26042025;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        // Take a user input as char and Tell the user if it is a vowel
        // aeiou

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char,I will tell you,I will tell you if it's a vowel");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

//        switch (user_input) {
//            case 'a':
//                System.out.println("Vowel");
//                break;
//            case 'e':
//                System.out.println("Vowel");
//                break;
//            case 'i':
//                System.out.println("Vowel");
//                break;
//            case 'o':
//                System.out.println("Vowel");
//                break;
//            case 'u':
//                System.out.println("Vowel");
//                break;
//            default:
//                System.out.println("It's not a vowel!");
//        }
//        System.out.println("outside the loop!");

        switch (user_input) {
            case 'a', 'i', 'o', 'u', 'e':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It it Consonant");

        }
    }
}
