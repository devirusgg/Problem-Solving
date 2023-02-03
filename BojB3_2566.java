import java.io.*;
import java.util.StringTokenizer;

public class BojB3_2566 {   // 최댓값

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] arr = new int[9][9];
        int[] ij = new int[2];
        int max = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (max <= arr[i][j]) {
                    max = arr[i][j];
                    ij[0] = i + 1;
                    ij[1] = j + 1;
                }
            }
        }
        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(ij[0]));
        bw.write(" ");
        bw.write(String.valueOf(ij[1]));
        bw.flush();
        bw.close();
    }

}
