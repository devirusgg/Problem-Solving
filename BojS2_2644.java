import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BojS2_2644 {  // BojS2_2644_촌수계산

    int n;
    int a;
    int b;
    int m;
    List<List<Integer>> relation;
    List<Boolean> visit;

    public BojS2_2644() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());
        relation = new ArrayList<>();
        visit = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            relation.add(new ArrayList<>());
            visit.add(false);
        }

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            relation.get(x).add(y);
            relation.get(y).add(x);
        }
    }

    private int solution() throws IOException {
        return bfs(a, b);
    }

    private int bfs(int start, int end) {
        Queue<int[]> q = new LinkedList<>();
        int d = 0;
        q.offer(new int[]{start, d});
        visit.set(start, true);

        while (!q.isEmpty()) {
            int[] currentNode = q.poll();
            int c = currentNode[0];
            int chon = currentNode[1];
            if (c == end) {
                return chon;
            }
            chon++;

            for (int person : relation.get(c)) {
                if (!visit.get(person)) {
                    q.offer(new int[]{person, chon});
                    visit.set(person, true);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new BojS2_2644().solution());
    }

}
