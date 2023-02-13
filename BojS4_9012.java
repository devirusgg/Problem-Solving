import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BojS4_9012 {   // 괄호

    public static void main(String[] args) throws IOException {
        new BojS4_9012().solution();
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] arr = br.readLine().split("");
            int vps = 0;
            boolean isWrong = false;

            for (String s : arr) {
                if (s.equals("(")) {
                    vps++;
                } else {
                    vps--;
                }
                if (vps < 0) {
                    isWrong = true;
                    break;
                }
            }

            if (isWrong) {
                System.out.println("NO");
            } else if (vps == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
