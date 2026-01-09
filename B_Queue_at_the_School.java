import java.io.*;
import java.util.*;

public class B_Queue_at_the_School {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = fs.nextInt();
        int t = fs.nextInt();

        String str = fs.next();

        char[] ch = str.toCharArray();
        while (t-- > 0) {   
            for (int i = 0; i < n - 1; i++) {
                if (ch[i] == 'B' && ch[i + 1] == 'G') {
                    ch[i] = 'G';
                    ch[i + 1] = 'B';
                    i++;
                }
            }
        }
        String ans = new String(ch);
        System.out.println(ans);
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
