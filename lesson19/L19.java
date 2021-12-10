import java.util.*;

public class L19 {
    public static void printSystem(double[][] a, double[] b) {
        for (int i=0; i<a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
        System.out.println(Arrays.toString(b));
        System.out.println();
    }
    // Меняем местами строки i1 и i2 в матрице a и векторе b
    public static void swap(double[][] a, double[] b, int i1, int i2) {
        double[] s = a[i1];
        a[i1] = a[i2];
        a[i2] = s;
        double t = b[i1];
        b[i1] = b[i2];
        b[i2] = t;
    }
    // Вычитание строки i2 из строки i1
    // с умножением на коэффициент k
    public static void sub(double[][] a, double[] b, int i1, int i2, double k) {
        for (int j=0; j<a[i1].length; j++) {
            a[i1][j] -= k*a[i2][j];
        }
        b[i1] -= k*b[i2];
    }
    // Решение треугольной системы
    public static double[] solveTri(double[][] a, double[] b) {
        double[] x = new double[a.length];
        for (int i=a.length-1; i>=0; i--) {
            x[i]=b[i];
            for (int j=i+1; j<a.length; j++) {
                x[i] -= a[i][j]*x[j];
            }
            x[i] /= a[i][i];
        }
        return x;
    }
    public static double[] solve(double[][] a, double[] b) {
        for (int i=0; i<a.length-1; i++) {
            // Находим строку не с нулём
            int i2 = i;
            while (i2<a.length && a[i2][i] == 0) {
            // проверка на 0!
                i2++;
            }
            // Ставим её на i-е место
            swap(a,b,i,i2);
            // Вычитаем её из остальных
            for (int j=i+1; j<a.length; j++) {
                double k = a[j][i] / a[i][i];
                sub(a,b,j,i,k);
            }
        }
        return solveTri(a,b);
    }
    public static void main(String[] args) {
        double[][] a = {
            {1,2,3},
            {2,4,7},
            {4,9,5}
        };
        double[] b = {14,31,37};

        double[] x = solve(a,b);
        printSystem(a,b);
        System.out.println(Arrays.toString(x));
    }
}
