import java.io.*;

public class bojS3_9095 {   // 1, 2, 3 더하기

    public static void main(String[] args) throws IOException {
        new bojS3_9095().solution();
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int[] n = new int[11];
        n[1] = 1;
        n[2] = 2;
        n[3] = 4;
        for (int i = 4; i <= 10; i++) {
            n[i] = n[i - 1] + n[i - 2] + n[i - 3];
        }
        while (t-- > 0) {
            int num = Integer.parseInt(br.readLine());
            sb.append(n[num]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
