import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BojB2_10810 {  // 공 넣기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] ball = new int[n];
        int m = Integer.parseInt(st.nextToken());

        for (int cnt = 0; cnt < m; cnt++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            shiftBall(ball, i, j, k);
        }

        StringBuilder sb = new StringBuilder();
        for (int num : ball) {
            sb.append(num).append(' ');
        }
        System.out.println(sb);
    }

    private static void shiftBall(int[] arr, int i, int j, int k) {
        for (; i <= j; i++) {
            arr[i - 1] = k;
        }
    }

}
