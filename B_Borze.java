import java.io.*;
import java.util.*;

public class B_Borze {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        String str = fs.next();

        char[] ch = str.toCharArray();

        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < ch.length) {
            if (ch[i] == '.') {
                ans.append("0");
                i++;
            } else {
                if (ch[i + 1] == '.') {
                    ans.append("1");
                } else {
                    ans.append("2");
                }
                i += 2;
            }
        }
        System.out.println(ans.toString());

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