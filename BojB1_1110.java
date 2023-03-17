import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BojB1_1110 {   // 더하기 사이클

    public static void main(String[] args) throws IOException {
        new BojB1_1110().solution();
    }

    private void solution() throws IOException {    // 14288KB  132ms
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num = Integer.parseInt(input);
        int result = 0;
        int cnt = 0;

        if (num == 0) {
            System.out.println(1);
            return;
        }

        while (Integer.parseInt(input) != result) {
            int[] n = new int[3];
            if (num < 10) {
//                n[0] = 0;
                n[1] = num;
            } else {
                n[0] = num / 10;
                n[1] = num % 10;
            }
            n[2] = n[0] + n[1];
            int sumRight = n[2] % 10;

            String newNum = String.valueOf(n[1]) + String.valueOf(sumRight);    // 더 빠름
//            String newNum = String.format("%d%d", n[1], sumRight);
            result = Integer.parseInt(newNum);
            num = result;
            cnt++;
        }
        System.out.println(cnt);
    }

}
