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
        for (int i=0; i<Math.min(a.length, n); i++) {
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
            if (a[i] < 0) {
                a[i] += 10;
                c = -1;
            }
        }
        if (c > 0) {
            a = extend(a,n+1);
            a[n] = c;
            n++;
        }
        while (n>0 && a[n-1]==0) {
            n--;
        }
        a = extend(a,n);
        return a;
    }
    public static int[] addWithCarry(int q, int[] a, int[] b) {
        int[] c = add(q, a, b);
        c = carry(q, c);
        return c;
    }
    // DONE: умножение числа (заданного массивом a цифр в q-чной
    // системе счисления) на цифру digit
    public static int[] multiplyDigit(int q, int[] a, int digit) {
        int n = a.length;
        int[] c = new int[n];
        for (int i=0; i<n; i++) {
            c[i] = a[i] * digit;
        }
        c = carry(q, c);
        return c;
    }
    // DONE: сдвиг числа (заданного массивом a цифр в q-чной
    // системе счисления) на k влево
    public static int[] shift(int q, int[] a, int k) {
        int n = a.length;
        int[] c = new int[n+k];
        for (int i=0; i<n; i++) {
            c[i+k] = a[i];
        }
        return c;
    }
    // DONE: умножение числа (заданного массивом a цифр в q-чной
    // системе счисления) на число (заданное массивом b цифр в q-чной
    // системе счисления)
    public static int[] multiply(int q, int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] c = new int[n+m];
        for (int i=0; i<n; i++) {
            int[] d = multiplyDigit(q, b, a[i]);
            d = shift(q, d, i);
            c = addWithCarry(q, c, d);
        }
        return c;
    }
    // DONE: вычитание числа b из числа a (оба заданы массивами
    // цифр в q-чной системе счисления)
    public static int[] subtract(int q, int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - get(b,i);
        }
        return carry(q, c);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(subtract(10, new int[]{7,3,6}, new int[]{4,5,2})));
        System.out.println(Arrays.toString(subtract(10, new int[]{1,0,0,0,9}, new int[]{2,0,0,0,7})));
        System.out.println(Arrays.toString(subtract(10, new int[]{1,0,1,0,1,1}, new int[]{0,9,0,9,0,1})));
        System.out.println(Arrays.toString(subtract(10, new int[]{1,0,0,0,9}, new int[]{2})));
        System.out.println(Arrays.toString(subtract(10, new int[]{1,0,0,0,1}, new int[]{2})));

        System.out.println(Arrays.toString(carry(10, new int[]{3,-2,4})));
        System.out.println(Arrays.toString(carry(10, new int[]{-1,0,0,0,2})));

        System.out.println(Arrays.toString(extend(new int[]{1,2}, 5))); // 1,2,0,0,0

        System.out.println(Arrays.toString(carry(10, new int[]{12,3}))); // 2,4
        System.out.println(Arrays.toString(carry(10, new int[]{1,1,12}))); // 1,1,2,1
        System.out.println(Arrays.toString(carry(10, new int[]{10,9,1}))); // 0,0,2
        System.out.println(Arrays.toString(carry(10, new int[]{10,11,12}))); // 0,2,3,1

        System.out.println(Arrays.toString(add(10, new int[]{1,2,3}, new int[]{9,9,9}))); // 10,11,12
        System.out.println(Arrays.toString(add(10, new int[]{9,9,9}, new int[]{9}))); // 18,9,9
        System.out.println(Arrays.toString(add(10, new int[]{9,9}, new int[]{9,9,9}))); // 18,18,9

        System.out.println(Arrays.toString(addWithCarry(10, new int[]{1,2,3}, new int[]{9,9,9}))); // 0,2,3,1

        System.out.println(Arrays.toString(multiplyDigit(10, new int[]{1,2,4}, 3))); // 3,6,2,1
        System.out.println(Arrays.toString(shift(10, new int[]{1,2,3},2))); // 0,0,1,2,3
        System.out.println(Arrays.toString(multiply(10, new int[]{2,1}, new int[]{8,9}))); //6,7,1,1
    }
}
