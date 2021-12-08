
import java.io.*;
import java.util.*;

// Исключения (Exception)
// - интерфейс Throwable
// - класс Exception
// - класс RuntimeException
//
// - throw e - выбрасывает ошибку
// - try ... catch - обрабатывает ошибку

class SomethingWrongException extends Exception {
    private int x;
    public SomethingWrongException(int x) {
        this.x = x;
    }
    public int getX() { return x; }
    public String toString() {
        return "Something went wrong: " + x;
    }
}

public class L18 {
    public static void someMethod(int x) {
        if (x == 5) {
            throw new SomethingWrongException(x);
        } else if (x == 10) {
            throw new RuntimeException("Wrong x!");
        }
        System.out.println(x*2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        do {
            try {
                someMethod(x);
            } catch (SomethingWrongException e) {
                System.out.println("Can't use that x: " + e.getX());
                System.out.println(e);
            }
            // catch (Exception e) {
            //     System.out.println("NOOO!!!");
            //     System.out.println(e);
            // }
            x = sc.nextInt();
        } while (x != 0);
    }
}
