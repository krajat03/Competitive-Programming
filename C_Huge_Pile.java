import java.io.*;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class C_Huge_Pile {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int t = fs.nextInt();

        while (t-- > 0) {
            long n = fs.nextLong();
            long k = fs.nextLong();

            out.println(solve(n, k));
        }

        out.close();
    }

    public static long solve(long n, long k) {
        if (n == k)
            return 0;
        if (k > n)
            return -1;

        Queue<Long> q = new LinkedList<>();
        Set<Long> visited = new HashSet<>();
        HashMap<Long, Integer> map = new HashMap<>();

        q.add(n);
        visited.add(n);
        map.put(n, 0);

        while (!q.isEmpty()) {
            long current = q.poll();
            int currentTime = map.get(current);

            long p1 = current / 2;
            long p2 = (current + 1) / 2;

            long[] nextPiles = { p1, p2 };

            for (long next : nextPiles) {
                if (next == k)
                    return currentTime + 1;

                if (next > k && !visited.contains(next)) {
                    visited.add(next);
                    map.put(next, currentTime + 1);
                    q.add(next);
                }
            }
        }
        return -1;
    }

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
    }
}