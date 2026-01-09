import java.io.*;
import java.util.*;

public class A_Beautiful_Year {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int year = fs.nextInt();
        while (true) {
            year++;
            if (hasDist(year)) {
                System.out.println(year);
                break;
            }
        }
        out.close();
    }

    private static boolean hasDist(int year){
        HashSet<Integer> set = new HashSet<>();

        while (year > 0) {
            int digit = year % 10;
            if (!set.add(digit)) {
                return false;
            }
            year /= 10;
        }
        return true;
    }

    // FastScanner class for fast input
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