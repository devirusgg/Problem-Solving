import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BojB4_2480 {   // 주사위 세개

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] dice = new int[3];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = Integer.parseInt(st.nextToken());
        }

        if (dice[0] == dice[1] && dice[1] == dice[2]) {
            System.out.println(10000 + (dice[0] * 1000));
        } else if (dice[0] == dice[1] || dice[1] == dice[2]) {
            System.out.println(1000 + (dice[1]) * 100);
        } else if (dice[2] == dice[0]) {
            System.out.println(1000 + (dice[0]) * 100);
        } else {
            int max = Math.max(dice[0], Math.max(dice[1], dice[2]));
            System.out.println(max * 100);
        }
    }

}
