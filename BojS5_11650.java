import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BojS5_11650 {  // 좌표 정렬하기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] point = new int[N][2];
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            point[i - 1][0] = Integer.parseInt(st.nextToken());
            point[i - 1][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(point, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else
                    return o1[0] - o2[0];
            }
        });

        for (int i = 1; i <= N; i++) {
            sb.append(point[i - 1][0]).append(" ").append(point[i - 1][1]).append("\n");
        }
        System.out.println(sb);
    }

}
