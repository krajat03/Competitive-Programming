import java.io.*;
import java.util.*;

public class B_Deck_of_Cards {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int t = fs.nextInt();
        while (t-- > 0) {
            solve();
        }
        out.close();
    }

    static void solve() {
        int n = fs.nextInt(); // cards
        int k = fs.nextInt(); // opetations
        String s = fs.next();

        int top = 0; 
        int bottom = 0; 
        int uncertain = 0; 

        for (int i = 0; i < k; i++) {
            char c = s.charAt(i);
            if (c == '0')
                top++;
            else if (c == '1')
                bottom++;
            else
                uncertain++;
        }

        StringBuilder res = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i <= top || i > n - bottom) {
                res.append('-'); 
            } else if (uncertain > 0) {
                res.append('?'); 
            } else {
                res.append('+'); 
            }
        }

        System.out.println(res.toString());
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