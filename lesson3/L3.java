
import java.util.*;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        // // цикл while
        // int i = 1;
        // while (i < n) {
        //     // действия
        //     i *= 2;
        // }
        // System.out.println(i);

        // // do-while
        // int k = 1;
        // do {
        //     // действия
        //     k *= 2;
        // } while (k < n);
        // System.out.println(k);

        ///////////
        // Вводятся целые числа, ввод заканчивается,
        // когда ввели 0
        // Вывести сумму введенных чисел (которые
        // введены до 0)
        //
        // 1 2 3 0
        // 6
        //
        // int s = 0;
        // int x = sc.nextInt();
        // while (x != 0) {
        //     s += x;
        //     x = sc.nextInt();
        // }
        // System.out.println(s);

        // int t = 0;
        // int y;
        // do {
        //     y = sc.nextInt();
        //     if (y != 0) {
        //         t += y;
        //     }
        // } while (y != 0);
        // System.out.println(t);

        //////////////////////////////
        // Последовательность Collatz:
        // после числа k идёт:
        // + 3*k+1, если k - нечётное
        // + k/2, если k - чётное
        // Последовательность заканчивается,
        // когда появляется 1
        //
        // 5 -> 16 -> 8 -> 4 -> 2 -> 1
        //
        // Вводится число N.
        // Вывести, сколько чисел и максимальное число
        // в последовательности, начинающейся с N
        //
        // 5
        // 6 16
        //
        // 27
        // ? ?
        //
        int k = sc.nextInt();
        int n = 1;
        int max = k;
        while (k != 1) {
            n++;
            // if (max < k) {
            //     max = k;
            // }
            max = Math.max(max, k);
            if (k % 2 == 0) {
                k /= 2;
            } else {
                k = 3 * k + 1;
            }
        }
        System.out.println(n + " " + max);
    }
}
