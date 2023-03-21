import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BojS5_13241 {  // 최소공배수

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long result = lcm(Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken()));
        System.out.println(result);
    }

    private long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    private long gcd(long a, long b) {
        long x = a;
        long y = b;
        long r;
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
        new BojS5_13241().solution();
    }

}
