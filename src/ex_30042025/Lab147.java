package ex_30042025;

public class Lab147 {
    public static void main(String[] args) {
            int [][] array_2d = {
                    {23,23,12},
                    {2,3,2},
                    {243,223,122}
            };

        for (int i = 0; i < array_2d.length ; i++) {
            for (int j = 0; j <array_2d[i].length; j++) {
                System.out.print(array_2d[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

}
