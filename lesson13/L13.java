import java.util.*;

public class L13 {
    // Сортировка вставками
    public static void insertion(int[] a) {
        int n = a.length;
        for (int i=1; i<n; i++) {
            int t = a[i];
            int j = i;
            while (j>0 && a[j-1]>t) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = t;
            System.out.println(i + " -> " + Arrays.toString(a));
        }
    }
    // ... выбором
    public static void selection(int[] a){
        int n = a.length;
        for (int i=0; i<n-1; i++) {
            int imin = i;
            for (int j=i+1; j<n; j++) {
                if (a[j] < a[imin]) {
                    imin = j;
                }
            }
            int t = a[imin];
            a[imin] = a[i];
            a[i] = t;
            System.out.println(i + " -> " + Arrays.toString(a));
        }
    }
    public static void main(String[] args) {
        int[] a = new int[]{5,3,6,4,1};
        System.out.println(Arrays.toString(a));
        insertion(a);
        System.out.println(Arrays.toString(a));

        a = new int[]{5,3,6,4,1};
        System.out.println(Arrays.toString(a));
        selection(a);
        System.out.println(Arrays.toString(a));
    }
}
