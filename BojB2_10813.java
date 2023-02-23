import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BojB2_10813 {  // 공 바꾸기

    public static void main(String[] args) throws IOException {
        new BojB2_10813().solution();
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] balls = new int[n];
        for (int i = 0; i < n; i++) {
            balls[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            changeBall(balls, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(balls[i]).append(' ');
        }
        System.out.println(sb);
    }

    private void changeBall(int[] arr, int i, int j) {
        int temp = arr[i - 1];
        arr[i - 1] = arr[j - 1];
        arr[j - 1] = temp;
    }

}
