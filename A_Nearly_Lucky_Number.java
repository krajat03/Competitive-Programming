import java.io.*;
import java.util.*;

public class A_Nearly_Lucky_Number {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        String n = fs.next(); 
        int luckyCount = 0;

        for (char ch : n.toCharArray()) {
            if (ch == '4' || ch == '7') {
                luckyCount++;
            }
        }

        if (luckyCount == 0) {
            out.println("NO");
        } else {
            boolean nearlyLucky = true;
            String countStr = String.valueOf(luckyCount);
            for (char ch : countStr.toCharArray()) {
                if (ch != '4' && ch != '7') {
                    nearlyLucky = false;
                    break;
                }
            }
            out.println(nearlyLucky ? "YES" : "NO");
        }

        out.close();
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            try { return br.readLine(); }
            catch (IOException e) { return null; }
        }
    }
}
