import java.io.*;
import java.util.*;

public class A_Soft_Drinking {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.close();
    }

    static void solve() {
        int n = fs.nextInt();

        int k = fs.nextInt();
        int l = fs.nextInt();

        int c = fs.nextInt();
        int d = fs.nextInt();

        int p = fs.nextInt();

        int nl = fs.nextInt();
        int np = fs.nextInt();

        int drinksNum = (k * l) / nl;
        int limesNum = p / np;

        int ans = Math.min(drinksNum, Math.min(limesNum, c * d)) / n;
        System.out.println(ans);
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