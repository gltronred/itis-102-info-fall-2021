
import java.io.*;
import java.util.*;

// Исключения (Exception)
// - интерфейс Throwable
// - класс Exception
// - класс RuntimeException
//
// - throw e - выбрасывает ошибку
// -

public class L18 {
    public static void someMethod(int x) {
        if (x == 5) {
            throw new RuntimeException("Something went wrong!");
        }
        System.out.println(x*2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        someMethod(sc.nextInt());
    }
}
