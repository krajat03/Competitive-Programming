import java.io.*;
import java.util.*;

public class E_Exquisite_Array {
    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int t = fs.nextInt();
        while (t-- > 0) {
            solve();
        }
        out.close();
    }

    static int[] parent;
    static long[] size;
    static boolean[] active;
    static long currentTotal;

    static void solve() {
        int n = fs.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++)
            p[i] = fs.nextInt();

        if (n < 2) {
            out.println();
            return;
        }

        int m = n - 1;
        List<Integer>[] diffGroups = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++)
            diffGroups[i] = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int d = Math.abs(p[i] - p[i + 1]);
            diffGroups[d].add(i);
        }

        parent = new int[m];
        size = new long[m];
        active = new boolean[m];
        for (int i = 0; i < m; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        currentTotal = 0;
        long[] results = new long[n];

        for (int k = n - 1; k >= 1; k--) {
            for (int idx : diffGroups[k]) {
                active[idx] = true;
                currentTotal += 1;

                if (idx > 0 && active[idx - 1]) {
                    union(idx, idx - 1);
                }
                if (idx < m - 1 && active[idx + 1]) {
                    union(idx, idx + 1);
                }
            }
            results[k] = currentTotal;
        }

        for (int k = 1; k < n; k++) {
            out.print(results[k] + (k == n - 1 ? "" : " "));
        }
        out.println();
    }

    static int find(int i) {
        if (parent[i] == i)
            return i;
        return parent[i] = find(parent[i]);
    }

    static void union(int i, int j) {
        int rootI = find(i);
        int rootJ = find(j);
        if (rootI != rootJ) {
            currentTotal -= (size[rootI] * (size[rootI] + 1)) / 2;
            currentTotal -= (size[rootJ] * (size[rootJ] + 1)) / 2;

            parent[rootI] = rootJ;
            size[rootJ] += size[rootI];

            currentTotal += (size[rootJ] * (size[rootJ] + 1)) / 2;
        }
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
    }
}