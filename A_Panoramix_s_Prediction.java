import java.io.*;
import java.util.*;

public class A_Panoramix_s_Prediction {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    private static int nextPrime(int n) {
        while (n <= 50) {
            int num = n;
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    n++;
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = fs.nextInt();
        int m = fs.nextInt();

        int nextPrime = nextPrime(n + 1);
        if (m == nextPrime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        out.close();
    }

    // FastScanner class for fast input
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                return null;
            }
        }
    }
}