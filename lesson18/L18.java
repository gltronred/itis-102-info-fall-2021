
import java.io.*;
import java.util.*;

// Исключения (Exception)
// - интерфейс Throwable
// - класс Exception
// - класс RuntimeException
//
// - throw e - выбрасывает ошибку
// - try ... catch - обрабатывает ошибку

class SomethingWrongException extends RuntimeException {
}

public class L18 {
    public static void someMethod(int x) {
        if (x == 5) {
            throw new SomethingWrongException();
        }
        System.out.println(x*2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        do {
            try {
                someMethod(x);
            } catch (Exception e) {
                System.out.println("Can't use that x!");
                System.out.println(e);
            }
            x = sc.nextInt();
        } while (x != 0);
    }
}
