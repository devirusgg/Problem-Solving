import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class BojS3_15651 {  // N과 M (3)

    int N;
    int M;
    List<List<Integer>> resultList;

    public BojS3_15651() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        resultList = new ArrayList<>();
    }

    private void solution() {
        dfs(0, new Stack<>());

        StringBuilder answer = new StringBuilder();
        for (List<Integer> result : resultList) {
            for (Integer rst : result) {
                answer.append(rst).append(' ');
            }
            answer.append('\n');
        }

        System.out.print(answer);
    }

    private void dfs(int depth, Stack<Integer> stack) {
        if (depth == M) {
            List<Integer> temp = new ArrayList<>(stack);
            resultList.add(temp);
            return;
        }

        for (int i = 1; i <= N; i++) {
            stack.add(i);
            dfs(depth + 1, stack);
            stack.pop();
        }
    }

    public static void main(String[] args) throws IOException {
        BojS3_15651 problem = new BojS3_15651();
        problem.solution();
    }

}
