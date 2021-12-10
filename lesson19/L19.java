import java.util.*;

class NoSolutionException extends Exception {}
class ManySolutionsException extends Exception {}

public class L19 {
    public static void printSystem(double[][] a) {
        for (int i=0; i<a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
        System.out.println();
    }
    // Меняем местами строки i1 и i2 в матрице a и векторе b
    public static void swap(double[][] a, int i1, int i2) {
        double[] s = a[i1];
        a[i1] = a[i2];
        a[i2] = s;
    }
    // Вычитание строки i2 из строки i1
    // с умножением на коэффициент k
    public static void sub(double[][] a, int i1, int i2, double k) {
        for (int j=0; j<a[i1].length; j++) {
            a[i1][j] -= k*a[i2][j];
        }
    }
    // Решение треугольной системы
    public static double[] solveTri(double[][] a) {
        double[] x = new double[a.length];
        for (int i=a.length-1; i>=0; i--) {
            int n = a[i].length;
            x[i]=a[i][n-1];
            for (int j=i+1; j<n-1; j++) {
                x[i] -= a[i][j]*x[j];
            }
            x[i] /= a[i][i];
        }
        return x;
    }
    public static double[] solve(double[][] a)
        throws NoSolutionException, ManySolutionsException
    {
        for (int i=0; i<a.length-1; i++) {
            // Находим строку не с нулём
            int i2 = i;
            while (i2<a.length && a[i2][i] == 0) {
            // проверка на 0!
                i2++;
            }
            // Ставим её на i-е место
            swap(a,i,i2);
            // Вычитаем её из остальных
            for (int j=i+1; j<a.length; j++) {
                double k = a[j][i] / a[i][i];
                sub(a,j,i,k);
            }
        }
        return solveTri(a);
    }
    public static void main(String[] args)
        throws NoSolutionException, ManySolutionsException
    {
        double[][] a = {
            {1,2,3,14},
            {2,4,7,31},
            {4,9,5,37}
        };

        double[] x = solve(a);
        printSystem(a);
        System.out.println(Arrays.toString(x));
    }
}
