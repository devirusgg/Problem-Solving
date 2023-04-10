import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class BojS3_15652 {    // BojS3_15652_N과 M (4)

    int n;
    int m;
    ArrayList<ArrayList<Integer>> results;

    public BojS3_15652() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        results = new ArrayList<>();
    }

    private void solution() {
        dfs(0, new Stack<>(), 1);

        StringBuilder sb = new StringBuilder();
        for(ArrayList<Integer> result: results) {
            for(int r : result) {
                sb.append(r).append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    private void dfs(int d, Stack<Integer> stack, int start) {
        if(d == m) {
            results.add(new ArrayList<>(stack));
            return;
        }

        for(int i = start; i <= n; i++) {
            stack.add(i);
            dfs(d + 1, stack, i);
            stack.pop();
        }
    }

    public static void main(String[] args) throws IOException {
        new BojS3_15652().solution();
    }

}
