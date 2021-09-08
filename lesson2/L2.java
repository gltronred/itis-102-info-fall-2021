
// import java.util.Scanner;
import java.util.*;

public class L2 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        // // Scanner sc = new Scanner(System.in);
        // int a;
        // a = sc.nextInt();
        // // int a = sc.nextInt();
        // int b = sc.nextInt();
        // double c = sc.nextDouble();
        // System.out.println(a+b+c);
        // // Деление
        // System.out.println(5 / 3); // 1
        // System.out.println(5.0 / 3); // 1.666...
        // System.out.println(5 / 3.0); // 1.666...
        // Прямая
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        boolean higher = (3 - 3*x < y);
        boolean t = true;
        boolean f = false;
        System.out.println(higher);
        // Условный оператор
        if (3 - 3*x < y) {
            System.out.println("HIGH");
        } else {
            System.out.println("LOW");
        }
        // Ввести целое число, удвоить его,
        // если оно нечётное
        int k = sc.nextInt();
        if (k % 2 == 1) {
            k = k*2;
            // Сокращенная запись:
            // k *= 2;
            // (аналогично есть += -= /= %=)
        }
        System.out.println(k);
    }
}
