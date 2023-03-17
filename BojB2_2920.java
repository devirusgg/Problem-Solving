import java.io.*;
import java.util.StringTokenizer;

public class BojB2_2920 {   // 음계

    public static void main(String[] args) throws IOException {
        new BojB2_2920().solution();
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] input = new int[9];
        boolean mixed = false;
        int asc = 1;

        for (int i = 1; i <= 8; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        if (input[1] == 1) {
            for (int i = 1; i <= 8; i++) {
                if (input[i] != i) {
                    mixed = true;
                    break;
                }
            }
        } else if (input[1] == 8) {
            for (int i = 8; i >= 1; i--) {
                if (input[9 - i] != i) {
                    mixed = true;
                    break;
                }
            }
            asc = 0;
        } else {
            mixed = true;
        }

        if (mixed) {
            bw.write("mixed");
        } else if (asc == 1) {
            bw.write("ascending");
        } else {
            bw.write("descending");
        }
        bw.flush();
        bw.close();
        br.close();
    }

//    private void solution() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String input = br.readLine();
//        if (input.equals("1 2 3 4 5 6 7 8")) {
//            bw.write("ascending");
//        } else if (input.equals("8 7 6 5 4 3 2 1")) {
//            bw.write("descending");
//        } else {
//            bw.write("mixed");
//        }
//        bw.flush();
//        bw.close();
//        br.close();
//    }

}
