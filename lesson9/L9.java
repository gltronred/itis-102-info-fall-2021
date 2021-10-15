import java.io.*;
import java.util.*;

public class L9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Вводятся координаты x,y (от 0 до 7)
        // Заполнить массив 8x8 так:
        // - вначале в массиве все клетки
        //   заполнены 0
        // - в клетку x,y поместить ладью
        //   (обозначенную числом 2)
        // - все клетки, которых можно достичь
        //   из x,y ходом ладьи, пометить
        //   числом 1

        int[][] a = new int[8][8];
        int y = sc.nextInt();
        int x = sc.nextInt();

        a[x][y] = 4;

        // Константный массив сдвигов
        int[][] d = {
            {-2,-1}, {+2,-1},
            {-2,+1}, {+2,+1},
            {-1,-2}, {-1,+2},
            {+1,-2}, {+1,+2}};
        // int[][] d = new int[8][2];
        // d[0][0] = -2; d[0][1] = -1;
        // d[1][0] = +2; d[1][1] = -1;
        // d[2][0] = -2; d[2][1] = +1;
        // d[3][0] = +2; d[3][1] = +1;
        // ...

        for (int i=0; i<d.length; i++) {
            int x2 = x+d[i][0];
            int y2 = y+d[i][1];
            if (0 <= x2 && x2 < 8 &&
                0 <= y2 && y2 < 8) {
                a[x2][y2] = 1;
            }
        }

        for (int i=7; i>=0; i--) {
            for (int j=0; j<8; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
