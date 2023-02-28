import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BojS5_7568 {   // 덩치

    public static void main(String[] args) throws IOException {
        new BojS5_7568().solution();
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[j][0] > arr[i][0]) {
                    if (arr[j][1] > arr[i][1]) {
                        rank++;
                    }
                }
            }
            sb.append(rank);
            if (i != n - 1) {
                sb.append(' ');
            }
        }
        System.out.println(sb);
    }

}
