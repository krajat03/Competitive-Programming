import java.io.*;
import java.util.*;

public class A_Petr_and_Book {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.close();
    }

    static void solve() {
        int total = fs.nextInt();
        int[] arr = new int[7];

        for(int i = 0; i < 7; i++){
            arr[i] = fs.nextInt();
        }

        while (true) {
            for (int i = 0; i < 7; i++) {
                total -= arr[i];

                if (total <= 0) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
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