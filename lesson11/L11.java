import java.util.*;

public class L11 {
    // public static int twice(int x) {
    //     return x*2;
    // }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i=2; i*i<=n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int primeSum(int n) {
        int s = 0;
        for (int i=2; i<=n; i++) {
            if (isPrime(i)) {
                s += i;
            }
        }
        return s;
    }
    public static int[] sum(int[] a, int[] b) {
        return new int[1];
    }
    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(15));
        System.out.println(isPrime(121));
        System.out.println(isPrime(1024));
        System.out.println(isPrime(65537));

        System.out.println(primeSum(100));

        // System.out.println(Arrays.toString(args));

        // System.out.println(twice(2));
        // int x = 123;
        // int y = 3;
        // int z = twice(y+1) + 17;
        // System.out.println(z);

        // int[] a = new int[5];
        // strangeSupreme(a);
        // System.out.println(Arrays.toString(a));
        // strange(a);
        // System.out.println(Arrays.toString(a));

        // System.out.println(Arrays.toString(input()));

        // System.out.println(add(x,3));

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(hello(name));
    }
    // public static void strangeSupreme(int[] x) {
    //     x = new int[3];
    //     System.out.println(Arrays.toString(x));
    // }
    // public static void strange(int[] x) {
    //     for (int i=0; i<x.length; i++) {
    //         x[i] = i+1;
    //     }
    // }
    // public static int[] input() {
    //     return new int[4];
    // }
    // public static int add(int x, int y) {
    //     return x+y;
    // }
    // public static String hello(String name) {
    //     return "Hello, " + name;
    // }
}
