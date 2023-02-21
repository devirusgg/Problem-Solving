import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BojB2_10811 {  // 바구니 뒤집기

    public static void main(String[] args) throws IOException {
        new BojB2_10811().solution();
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] box = new int[N + 1];

        for (int i = 1; i < box.length; i++) {
            box[i] = i;
        }

        for (int cnt = 0; cnt < M; cnt++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            changeBox(box, i, j);
        }

        for (int i = 1; i < box.length; i++) {
            sb.append(box[i]).append(' ');
        }
        System.out.print(sb);
    }

    private void changeBox(int[] arr, int i, int j) {
        for (; i < j; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }

}
