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
    public static int[] carry(int q, int[] a) {
        return a;
    }
    public static int[] addWithCarry(int q, int[] a, int[] b) {
        int[] c = add(q, a, b);
        c = carry(q, c);
        return c;
    }
    public static void main(String[] args) {
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
