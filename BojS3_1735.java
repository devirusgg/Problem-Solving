import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BojS3_1735 {   // 분수 합

    int n = 2;

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = reduceFraction(sumFraction(a, b));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(result[i]);
            if (i != n - 1) {
                sb.append(' ');
            }
        }
        System.out.println(sb);
    }

    // 분수를 기약분수로
    private int[] reduceFraction(int[] fraction) {
        int gcd = gcd(fraction[0], fraction[1]);
        if (gcd != 1) {
            fraction[0] /= gcd;
            fraction[1] /= gcd;
        }
        return fraction;
    }

    // 분수간 덧셈
    private int[] sumFraction(int[] a, int[] b) {
        int bottom = lcm(b[0], b[1]);
        int top = 0;
        for (int i = 0; i < n; i++) {
            top += a[i] * (bottom / b[i]);
        }
        return new int[]{top, bottom};
    }

    private int lcm(int x, int y) {
        return x * y / gcd(x, y);
    }

    private int gcd(int x, int y) {
        int r;
        while (true) {
            r = x % y;
            if (r == 0) {
                return y;
            }
            x = y;
            y = r;
        }
    }

    public static void main(String[] args) throws IOException {
        new BojS3_1735().solution();
    }

}
