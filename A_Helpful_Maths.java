import java.io.*;
import java.util.*;

public class A_Helpful_Maths {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.close();
    }

    static void solve() {
        String str = fs.next();

        str = str.replace("+", "");
        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            ans.append(ch[i]);
            if (i + 1 < ch.length) {
                ans.append('+');
            }
        }
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