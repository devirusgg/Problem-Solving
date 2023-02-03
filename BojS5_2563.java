import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BojS5_2563 {   // 색종이

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] paper = new int[100][100];
        int n = Integer.parseInt(br.readLine());
        int area = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken()) + 10;
            int height = Integer.parseInt(st.nextToken()) + 10;
            for (int j = width - 10; j < width; j++) {
                for (int k = height - 10; k < height; k++) {
                    paper[j][k] = 1;
                }
            }

        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] != 0) {
                    area++;
                }
            }
        }
        System.out.println(area);
    }

}
