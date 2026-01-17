import java.io.*;
import java.util.*;

public class B_Effective_Approach {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = fs.nextInt();
        int[] pos = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int val = fs.nextInt();
            pos[val] = i;
        }

        long vCount = 0, pCount = 0;
        int q = fs.nextInt();

        for (int i = 0; i < q; i++) {
            int target = fs.nextInt();
            int idx = pos[target];

            vCount += idx;
            pCount += (n - idx + 1);
        }
        System.out.println(vCount + " " + pCount);
    }

    static void solve() {

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