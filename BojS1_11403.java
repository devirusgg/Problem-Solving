import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BojS1_11403 {    // BojS1_11403_경로 찾기

    int n;
    ArrayList<ArrayList<Integer>> g;
    ArrayList<Integer> visit;

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Integer> subList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                subList.add(Integer.parseInt(st.nextToken()));
            }
            g.add(subList);
        }

        initVisitZero();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            dfs(i);

            for (int value : visit) {
                sb.append(value).append(' ');
            }
            sb.append('\n');

            initVisitZero();
        }
        System.out.print(sb);
    }

    private void dfs(int x) {
        for (int i = 0; i < n; i++) {
            if (g.get(x).get(i) == 1 && visit.get(i) == 0) {
                visit.set(i, 1);
                dfs(i);
            }
        }
    }

    private void initVisitZero() {
        visit = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            visit.add(0);
        }
    }

    public static void main(String[] args) throws IOException {
        new BojS1_11403().solution();
    }

}
