import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BojS5_1978 {   // 소수 찾기

    public static void main(String[] args) throws IOException {
        new BojS5_1978().solution();
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int num = 665;
        int cnt = 0;

        while (cnt != N) {
            num++;
            if (String.valueOf(num).contains("666")) {
                cnt++;
            }
        }
        System.out.println(num);
    }

}
