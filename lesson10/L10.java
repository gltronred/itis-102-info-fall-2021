import java.io.*;
import java.util.*;

public class L10 {
  public static void main(String[] args) {
    // Игра "Жизнь" - https://ru.wikipedia.org/wiki/%D0%98%D0%B3%D1%80%D0%B0_%C2%AB%D0%96%D0%B8%D0%B7%D0%BD%D1%8C%C2%BB
    //
    // Поле 20x20, соседняя клетка -
    // по горизонтали, вертикали или диагонали
    // Границы "склеены", у верхней строки -
    // соседи в нижней и наоборот, у крайнего
    // левого столбца - соседи в крайнем правом
    // Клетки либо живые, либо мертвые
    //
    // У живой клетки:
    // >3 соседей - она погибает от перенаселения,
    // <2 - от одиночества
    // У мертвой клетки
    // 3 живых соседа - она рождается
    //
    // Вводится начальное состояние поля
    // (размеры того, что нужно, и сами клетки)
    // Промоделировать один шаг
    // Вывести, что получится

    // 000
    // 010
    // 000
    //
    // 00000  00100
    // 01110  00100
    // 00000  00100
    //
    Scanner sc = new Scanner(System.in);
    int n = 20;
    int[][] a = new int[n][n];

    int realN = sc.nextInt();
    int realM = sc.nextInt();
    for (int i=0; i<realN; i++) {
        for (int j=0; j<realM; j++) {
            a[i][j] = sc.nextInt();
        }
    }

    // "сделать шаг"

    for (int i=0; i<20; i++) {
        for (int j=0; j<20; j++) {
            if (a[i][j] == 0) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
  }
}
