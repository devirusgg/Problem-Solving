import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BojB2_2292 {   // 벌집

    public static void main(String[] args) throws IOException {
        new BojB2_2292().solution();
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 1;
        int cnt = 1;

        while (true) {
            if (N == 1) {
                System.out.println(cnt);
                break;
            }
            num += (6 * cnt);
            cnt++;
            if (N <= num) {
                System.out.println(cnt);
                break;
            }
        }
    }

}
/*
1       1
2~7     6
8~19    12
20~37   18
38~61   24

1 7 19 37 61
6 12 18 24
*/