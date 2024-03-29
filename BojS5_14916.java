import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BojS5_14916 {  // 거스름돈

    public static void main(String[] args) throws IOException {
        new BojS5_14916().solution();
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                cnt += n / 5;
                n %= 5;
            } else {
                n -= 2;
                cnt++;
            }
        }
        if (n != 0) {
            System.out.println(-1);
        } else {
            System.out.println(cnt);
        }
    }

}
