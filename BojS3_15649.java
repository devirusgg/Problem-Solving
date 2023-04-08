import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class BojS3_15649 {    // BojS3_15649_N과 M (1)

    /** Stack + ArrayList
     * 29496KB, 380ms
     */
    int n;
    int m;
    ArrayList<ArrayList<Integer>> results;
    Stack<Integer> stack;

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        results = new ArrayList<>();
        stack = new Stack<>();

        dfs(0, new Stack<>());

        StringBuilder answer = new StringBuilder();
        for (ArrayList<Integer> result : results) {
            for (int ans : result) {
                answer.append(ans).append(' ');
            }
            answer.append('\n');
        }
        System.out.print(answer);
    }

    private void dfs(int depth, Stack<Integer> stack) {
        if (m == depth) {
            ArrayList<Integer> temp = new ArrayList<>(stack);
            results.add(temp);
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (stack.contains(i)) {
                continue;
            }
            stack.add(i);
            dfs(depth + 1, stack);
            stack.pop();
        }
    }

    /** Stack
     * 28424KB, 388ms
     */
//    int n;
//    int m;
//    StringBuilder answer;
//
//    private void solution() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        m = Integer.parseInt(st.nextToken());
//        answer = new StringBuilder();
//
//        dfs(0, new Stack<>());
//        System.out.print(answer);
//    }
//
//    private void dfs(int depth, Stack<Integer> stack) {
//        if (m == depth) {
//            for (int stck : stack) {
//                answer.append(stck).append(' ');
//            }
//            answer.append('\n');
//            return;
//        }
//
//        for (int i = 1; i <= n; i++) {
//            if (stack.contains(i)) {
//                continue;
//            }
//            stack.add(i);
//            dfs(depth + 1, stack);
//            stack.pop();
//        }
//    }

    /** ArrayList
     * 35208KB, 400ms
     */
//    int n;
//    int m;
//    ArrayList<ArrayList<Integer>> results;
//
//    private void solution() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        m = Integer.parseInt(st.nextToken());
//        results = new ArrayList<>();
//
//        dfs(0, new ArrayList<>());
//
//        StringBuilder answer = new StringBuilder();
//        for (ArrayList<Integer> result : results) {
//            for (int ans : result) {
//                answer.append(ans).append(' ');
//            }
//            answer.append('\n');
//        }
//        System.out.print(answer);
//    }
//
//    private void dfs(int depth, ArrayList<Integer> list) {
//        if (m == depth) {
//            results.add(list);
//            return;
//        }
//
//        for (int i = 1; i <= n; i++) {
//            if (list.contains(i)) {
//                continue;
//            }
//            list.add(i);
//            ArrayList<Integer> temp = new ArrayList<>(list);
//            dfs(depth + 1, temp);
//            list.remove(list.size() - 1);
//        }
//    }

    public static void main(String[] args) throws IOException {
        new BojS3_15649().solution();
    }

}
