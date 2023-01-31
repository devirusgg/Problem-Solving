import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BojS4_1065 {   // 한수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            if (i < 100) {
                cnt++;
            } else if (i == 1000) {
                continue;
            } else {
                int i100 = i / 100;
                int i10 = (i % 100) / 10;
                int i1 = (i % 100) % 10;
                int x = i10 - i100;

                if (i100 + x == i10) {
                    if (i10 + x == i1) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

}