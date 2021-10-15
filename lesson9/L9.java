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

        a[x][y] = 3;

        for (int d=1;
             x-d>=0 && y-d>=0;
             d++) {
            a[x-d][y-d] = 1;
        }
        for (int d=1;
             x+d<8 && y+d<8;
             d++) {
            a[x+d][y+d] = 1;
        }
        for (int d=1;
             x-d>=0 && y+d<8;
             d++) {
            a[x-d][y+d] = 1;
        }
        for (int d=1;
             x+d<8 && y-d>=0;
             d++) {
            a[x+d][y-d] = 1;
        }

        for (int i=7; i>=0; i--) {
            for (int j=0; j<8; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}