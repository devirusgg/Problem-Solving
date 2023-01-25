import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bojS4_11399 {  // ATM

    public static void main(String[] args) throws IOException {
        new bojS4_11399().solution();
    }

    private void solution() throws IOException {    // 14384KB	128ms
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] p = new int[n];
        int sum = 0;
        int result = 0;
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(p); // 아래 정렬을 위한 for문 대체, 더 빠름
        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                int temp;
//                if (p[i] >= p[j]) {
//                    temp = p[i];
//                    p[i] = p[j];
//                    p[j] = temp;
//                }
//            }
            sum += p[i];
            result += sum;
        }
        System.out.println(result);
    }

}
