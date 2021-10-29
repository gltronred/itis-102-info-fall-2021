import java.util.*;

public class L12 {
    public static int get(int[] a, int i) {
        if (i >= a.length) {
            return 0;
        } else {
            return a[i];
        }
    }
    public static int[] add(int q, int[] a, int[] b) {
        int n = a.length;
        if (n < b.length) {
            n = b.length;
        }
        int[] c = new int[n];
        for (int i=0; i<n; i++) {
            c[i] = get(a,i) + get(b,i);
        }
        return c;
    }
    public static int[] extend(int[] a, int n) {
        int[] b = new int[n];
        for (int i=0; i<a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }
    public static int[] carry(int q, int[] a) {
        int c = 0;
        int n = a.length;
        for (int i=0; i<n; i++) {
            a[i] += c;
            c = a[i] / q;
            a[i] %= q; // a[i] = a[i] % q
        }
        if (c > 0) {
            a = extend(a,n+1);
            a[n] = c;
        }
        return a;
    }
    public static int[] addWithCarry(int q, int[] a, int[] b) {
        int[] c = add(q, a, b);
        c = carry(q, c);
        return c;
    }
    // TODO: умножение числа на цифру
    public static int[] multiplyDigit(int q, int[] a, int digit) {
        return a;
    }
    // TODO: сдвиг числа на k влево
    public static int[] shift(int q, int[] a, int k) {
        return a;
    }
    // TODO: умножение числа на число
    public static int[] multiply(int q, int[] a, int[] b) {
        return a;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(extend(new int[]{1,2}, 5))); // 1,2,0,0,0

        System.out.println(Arrays.toString(carry(10, new int[]{12,3}))); // 2,4
        System.out.println(Arrays.toString(carry(10, new int[]{1,1,12}))); // 1,1,2,1
        System.out.println(Arrays.toString(carry(10, new int[]{10,9,1}))); // 0,0,2
        System.out.println(Arrays.toString(carry(10, new int[]{10,11,12}))); // 0,2,3,1

        System.out.println(Arrays.toString(add(10, new int[]{1,2,3}, new int[]{9,9,9}))); // 10,11,12
        System.out.println(Arrays.toString(add(10, new int[]{9,9,9}, new int[]{9}))); // 18,9,9
        System.out.println(Arrays.toString(add(10, new int[]{9,9}, new int[]{9,9,9}))); // 18,18,9

        System.out.println(Arrays.toString(addWithCarry(10, new int[]{1,2,3}, new int[]{9,9,9}))); // 0,2,3,1
    }
}
