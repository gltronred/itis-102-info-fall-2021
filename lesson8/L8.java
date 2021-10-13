import java.io.*;
import java.util.*;

public class L8 {
    public static void main(String[] args) {
        // int n = 4;
        // int[][] a = new int[n][];
        // for (int i=0; i<n; i++) {
        //     a[i] = new int[1+i];
        //     for (int j=0; j<i+1; j++) {
        //         a[i][j] = i+j;
        //     }
        // }

        // for (int i=0; i<n; i++) {
        //     System.out.println(Arrays.toString(a[i]));
        // }

        // ///////////////////////////////
        // int m = 3;
        // int[][] b = new int[n][m];
        // for (int i=0; i<n; i++) {
        //     for (int j=0; j<m; j++) {
        //         b[i][j] = i*j;
        //     }
        // }

        // for (int i=0; i<n; i++) {
        //     System.out.println(Arrays.toString(b[i]));
        // }

        // Вводятся размеры двумерного массива N, M
        // Вводятся элементы двумерного массива
        // Проверить, что во всех строчках
        // одинаковая сумма элементов
        // Вывести YES и сумму, если она одинаковая
        // Вывести NO, если в какой-то строке сумма
        // отличается
        //
        // 3 4
        // 1 2 3 4
        // 10 0 0 0
        // 1 5 5 -1
        // ------
        // YES 10
        //
        // 3 2
        // 1 2
        // 3 0
        // 1 -1
        // ------
        // NO

        // То же, только суммы по столбцам
        //
        // 3 4
        // 1 2 3 4
        // 10 9 8 7
        // 1 1 1 1
        // -----
        // YES 12
        //
        // 3 2
        // 1 2
        // 3 0
        // 1 -1
        // -----
        // NO

        // Решение задачи с суммой по строкам
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int[][] a = new int[n][m];
        // for (int i=0; i<n; i++) {
        //     for (int j=0; j<m; j++) {
        //         a[i][j] = sc.nextInt();
        //     }
        // }

        // int s0 = 0;
        // for (int i=0; i<n; i++) {
        //     s0 += a[i][0];
        // }

        // boolean f = true;
        // for (int i=1; i<m; i++) {
        //     int si = 0;
        //     for (int j=0; j<n; j++) {
        //         si += a[j][i];
        //     }
        //     f &= (s0 == si);
        // }

        // if (f) {
        //     System.out.println("YES " + s0);
        // } else {
        //     System.out.println("NO");
        // }

        // Вводится N
        // Вводится N*N элементов квадратной
        // матрицы
        // Вывести YES, если она является
        // магическим квадратом (совпадают суммы
        // по строкам, столбцам, основной и
        // побочной диагоналям)
        // Вывести NO, иначе
        //
        // 3
        // 8 1 6
        // 3 5 7
        // 4 9 2
        // -----
        // YES
    }
}
