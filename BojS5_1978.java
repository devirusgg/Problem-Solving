import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BojS5_1978 {   // 소수 찾기

    public static void main(String[] args) throws IOException {
        new BojS5_1978().solution();
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            boolean isPrime = true;

            if (num <= 3) {
                if (num > 1) {
                    cnt++;
                }
                continue;
            }

//            for (int i = 2; i < num; i++) {   // 전부 탐색
            for (int i = 2; i <= Math.sqrt(num); i++) {   // 제곱근 이용하면 탐색을 더 줄일 수 있음
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
