
import java.io.*;
import java.util.*;

public class L7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Вводятся вещественное y
        // Вводится неотрицательное целое n
        // Вводятся коэффициенты полинома
        // a_n a_{n-1} ... a_0
        // Вывести значение P(y) полинома
        // P(x) = a_n x^n + a_{n-1} x^{n-1} +
        // + ... + a_1 x + a_0
        // в точке y
        //
        // >   2.0 2
        // >   1.5 -3.0 5.0
        // <   5.0
        //
        // (1.5 x^2 - 3 x + 5 для x = 2.0)
        double y = sc.nextDouble();
        int n = sc.nextInt();
        double s = 0;
        for (int k=n; k>=0; k--) {
            double a = sc.nextDouble();
            double p = 1;
            for (int i=0; i<k; i++) {
                p *= y;
            }
            s += a*p;
        }
        System.out.println(s);
    }
}
