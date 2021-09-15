import java.io.*;
import java.util.*;

public class L4 {
    public static void main(String[] args) {
        // for (int i=0; i<5; i++) {
        //     System.out.println(i);
        // }
        Scanner sc = new Scanner(System.in);

        // // Ввести неотрицательное N.
        // // Вывести факториал N!
        // // N! = 1*2*...*N
        // // 0! = 1
        // // 3! = 1*2*3 = 6
        // int n = sc.nextInt();
        // int p = 1;
        // for (int i=1; i<=n; i++) {
        //     p *= i;
        // }
        // System.out.println(p);

        // // Вводится неотрицательное N.
        // // Вывести N!!
        // // N!! =
        // // = 1*3*5*...*N, если N - нечётное
        // // = 2*4*6*...*N, если N - чётное
        // int n = sc.nextInt();
        // int p = 1;
        // for (int i = n; i > 0; i -= 2) {
        //     p *= i;
        // }
        // System.out.println(p);

        // Вводится неотрицательное целое N
        // Вывести, сколько простых чисел на
        // отрезке [1;N]
        //
        // 11
        // 5
        // (потому что простые числа от 1 до 11:
        //  2,3,5,7,11)
        int n = sc.nextInt();
        int s = 0;
        for (int i=2; i<=n; i++) {
            // проверить i на простоту,
            // результат в f
            boolean f = true;
            int j = 2;
            while (j*j <= i && f) {
                f &= (i % j != 0);
                j++;
            }
            // если простое, добавляем к количеству
            if (f) {
                s++;
            }
        }
        System.out.println(s);
    }
}
