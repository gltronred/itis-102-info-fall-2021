
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
        int s = 0;
        int x = sc.nextInt();
        while (x != 0) {
            s += x;
            x = sc.nextInt();
        }
        System.out.println(s);

        int t = 0;
        int y;
        do {
            y = sc.nextInt();
            if (y != 0) {
                t += y;
            }
        } while (y != 0);
        System.out.println(t);
    }
}
