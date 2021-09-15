import java.io.*;
import java.util.*;

public class L4 {
    public static void main(String[] args) {
        // for (int i=0; i<5; i++) {
        //     System.out.println(i);
        // }
        Scanner sc = new Scanner(System.in);

        // Ввести неотрицательное N.
        // Вывести факториал N!
        // N! = 1*2*...*N
        // 0! = 1
        // 3! = 1*2*3 = 6
        int n = sc.nextInt();
        int p = 1;
        for (int i=1; i<=n; i++) {
            p *= i;
        }
        System.out.println(p);

        // Вводится неотрицательное N.
        // Вывести N!!
        // N!! =
        // = 1*3*5*...*N, если N - нечётное
        // = 2*4*6*...*N, если N - чётное
    }
}
