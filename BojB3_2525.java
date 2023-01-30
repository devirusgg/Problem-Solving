import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BojB3_2525 {   // 오븐 시계

    public static void main(String[] args) throws IOException {
        new BojB3_2525().solution();
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int[] time = new int[2];
        time[0] = Integer.parseInt(st.nextToken());
        time[1] = Integer.parseInt(st.nextToken());
        int input = Integer.parseInt(br.readLine());

        time[1] += input;
        if (time[1] > 59) {
            int hour = 0;
            hour = time[1] / 60;
            time[1] %= 60;
            time[0] += hour;
        }
        if (time[0] > 23) {
            time[0] -= 24;
        }
        sb.append(time[0]).append(" ").append(time[1]);
        System.out.println(sb);
    }

}
