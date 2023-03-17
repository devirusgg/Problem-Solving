import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BojS3_13305 {  // 주유소

    public static void main(String[] args) throws IOException {
        new BojS3_13305().solution();
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] roads = new long[n - 1];
        for (int i = 0; i < roads.length; i++) {
            roads[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        long[] prices = new long[n];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }

        int idx = 0;
        long cost = prices[0] * roads[0];
        for (int i = 1; i < n - 1; i++) {
            if (prices[i] <= prices[idx]) {
                idx = i;
            }
            cost += prices[idx] * roads[i];
        }
        System.out.println(cost);
    }

}
