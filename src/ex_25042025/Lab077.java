package ex_25042025;

public class Lab077 {
    public static void main(String[] args) {
            String password = "ABCD";
            String pass_u = password.toLowerCase();
            //pass_u == password
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));
//        Pramod@123 = pramod@123 = pRamOd@123

        System.out.println(password.substring(0,3));
        System.out.println(password.length());
        System.out.println(password.indexOf('C'));
    }
}
