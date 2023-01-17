import java.io.*;

public class bojB3_14720 {  // 우유 축제

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] info = new int[n];
        int temp = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            info[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < n; i++) {
            if (temp == 0 && temp == info[i]) {
                cnt++;
                temp = 1;
            } else if (temp == 1 && temp == info[i]) {
                cnt++;
                temp = 2;
            } else if (temp == 2 && temp == info[i]) {
                cnt++;
                temp = 0;
            }
        }
        bw.write(String.valueOf(cnt));
        br.close();
        bw.close();
    }

}
