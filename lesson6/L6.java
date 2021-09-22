import java.io.*;
import java.util.*;

public class L6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Вводятся числа, ввод заканчивается 0
        //
        // 1. Вывести максимальное число
        //
        // -3 -2 -1 0
        // -1
        //
        // 2. Вывести сумму чисел после первого
        // максимального
        //
        // 1 2 1 6 1 2 2 0
        // 5
        //
        // 1 2 1 1 2 2 0
        // 6
        //
        // 3. Вывести сумму чисел от первого
        // максимального до последнего
        // минимального
        //
        // 1 3 2 3 -1 2 -1 0
        // 6
        //
        // -1 1 2 3 0
        // 0

        int n = sc.nextInt();
        int max = n;
        int min = n;
        int sumAll = 0;
        int sumBetween = 0;
        while (n != 0) {
            if (n <= min) {
                min = n;
                sumBetween = sumAll;
            }
            sumAll += n;
            if (n > max) {
                max = n;
                sumAll = 0;
            }
            n = sc.nextInt();
        }
        System.out.println(sumBetween);
    }
}
