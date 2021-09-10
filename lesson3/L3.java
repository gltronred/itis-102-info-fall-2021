
import java.util.*;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // цикл while
        int i = 1;
        while (i < n) {
            // действия
            i *= 2;
        }
        System.out.println(i);

        // do-while
        int k = 1;
        do {
            // действия
            k *= 2;
        } while (k < n);
        System.out.println(k);
    }
}
