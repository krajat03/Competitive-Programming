import java.util.Scanner;

public class C_Blackslex_and_Number_Theory {
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long k = 0;
            for (int i = 1; i < n; i++) {
                long diff = Math.abs(a[i] - a[0]);
                k = gcd(k, diff);
            }
            
            System.out.println(k);
        }

        sc.close();
    }
}