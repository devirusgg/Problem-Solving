import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BojS2_1012 {   // 유기농 배추

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int m;
    int n;
    int k;
    int[][] graph;

    public BojS2_1012() throws IOException {
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
    }

    private void solution() throws IOException {
        graph = new int[n][m];
        createGraph(k);
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }

    private void createGraph(int k) throws IOException {
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[y][x] = 1;
        }
    }

    private boolean dfs(int x, int y) {
        if (x >= 0 && x < n && y >= 0 && y < m && graph[x][y] == 1) {
            graph[x][y] = 0;
            dfs(x, y - 1);
            dfs(x - 1, y);
            dfs(x, y + 1);
            dfs(x + 1, y);
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            BojS2_1012 problem = new BojS2_1012();
            problem.solution();
        }
    }

}
