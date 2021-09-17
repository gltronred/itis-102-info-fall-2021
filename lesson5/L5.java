import java.io.*;
import java.util.*;

public class L5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Вводятся целые положительные
        // числа, ввод заканчивается 0.
        // Вывести YES, если все
        // введённые числа - простые.
        // Иначе - NO
        //
        // 17 3 6 0
        // NO
        //
        // 47 97 5 0
        // YES
        //
        // 1 2 0
        // NO
        //
        // 0
        // YES
        //
        // boolean f = true;
        // int a = sc.nextInt();
        // while (a != 0) {
        //     // проверяем: a - простое?
        //     boolean g = a > 1;
        //     int i = 2;
        //     while (i*i <= a && g) {
        //         g &= (a % i != 0);
        //         i++;
        //     }
        //     f &= g;
        //     a = sc.nextInt();
        // }
        // if (f) {
        //     System.out.println("YES");
        // } else {
        //     System.out.println("NO");
        // }

        // Вводятся целые положительные
        // числа, ввод заканчивается 0.
        // Вывести YES, если у всех
        // чисел есть делитель, являющийся
        // квадратом числа больше 1
        // Иначе NO
        //
        // 54 49 8 0
        // YES
        //
        // 54 15 8 0
        // NO
        //
        // 54 1 0
        // NO
        //
        // 0
        // YES
        //
        boolean allHasSquare = true;
        int a = sc.nextInt();
        while (a != 0) {
            // проверка, что есть
            // делитель-квадрат
            boolean hasSquare = false;
            for (int b = 2; b <= a; b++){
                int sqrtB = (int)Math.floor(Math.sqrt(b));
                hasSquare |= (a % b == 0)
                    && (sqrtB * sqrtB == b);
            }
            // boolean hasSquare = false;
            // for (int b = 2; b*b <= a; b++) {
            //     hasSquare |= (a % (b*b) == 0);
            // }
            allHasSquare &= hasSquare;
            a = sc.nextInt();
        }
        if (allHasSquare) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
