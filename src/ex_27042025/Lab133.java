package ex_27042025;

public class Lab133 {
    public static void main(String[] args) {
        //        block of code that we can reuse - function
//        pre build - Math.max()
//        user created/ defined

//        two component
//        1.defined
//        2.call the function

//call the function
//        greet();
//        greet();
//        greet();
//        greet();

        for (int i = 0; i <= 10 ; i++) {
            greet();
        }

        greet2();
    }
//define the function
    static void greet(){
        System.out.println("Hi how are you");
    }
    static void greet2(){
        System.out.println("Hi how are you grret 2");
    }
}
