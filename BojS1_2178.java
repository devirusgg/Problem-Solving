import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BojS1_2178 {  // BojS1_2178_미로탐색

    int n, m;
    List<List<Integer>> graph;
    List<List<Boolean>> visit;

    private int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>();
        visit = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            visit.add(new ArrayList<>());
            for (int j = 0; j < m; j++) {
                visit.get(i).add(false);
            }
        }
        for (int i = 0; i < n; i++) {
            String[] sList = br.readLine().split("");
            List<Integer> temp = new ArrayList<>();
            for (String s : sList) {
                temp.add(Integer.parseInt(s));
            }
            graph.add(temp);
        }

        return bfs();
    }

    private int bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, 1});
        visit.get(0).set(0, true);

        int[] dx = {0, -1, 0, 1};
        int[] dy = {-1, 0, 1, 0};

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int d = current[2];
            d++;
            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < m && graph.get(nx).get(ny) == 1) {
                    if (!visit.get(nx).get(ny)) {
                        graph.get(nx).set(ny, d);
                        q.offer(new int[]{nx, ny, d});
                        visit.get(nx).set(ny, true);
                    }
                }
            }
        }
        return graph.get(n - 1).get(m - 1);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new BojS1_2178().solution());
    }

}
