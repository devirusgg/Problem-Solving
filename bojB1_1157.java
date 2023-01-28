import java.io.*;

public class bojB1_1157 {   // 단어 공부

    public static void main(String[] args) throws IOException {
        new bojB1_1157().solution();
    }

    // a ~ z : 97 ~ 122
    // A ~ Z : 65 ~ 90
    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int[] alp = new int[123];
        int max = 0;
        int index = 0;

        for (int i = 0; i < input.length(); i++) {
            int c = input.charAt(i);
            alp[c]++;
        }
        for (int i = 65; i <= 90; i++) {
            alp[i] += alp[i + 32];
            if (max < alp[i]) {
                max = alp[i];
                index = i;
            } else if (max == alp[i]) {
                index = -1;
            }
        }

        if (index != -1) {
            bw.write(index);
        } else {
            bw.write("?");
        }
        bw.flush();
        bw.close();
        br.close();
    }

//    private void solution() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String input = br.readLine();
//        int[] alp = new int[123];
//        int max = 0;
//        int maxCount = 0;
//        int index = 0;
//
//        for (int i = 0; i < input.length(); i++) {
//            int c = input.charAt(i);
//            alp[c]++;
//        }
//        for (int i = 65; i <= 90; i++) {
//            alp[i] += alp[i + 32];
//            if (max < alp[i]) {
//                max = alp[i];
//                index = i;
//            }
//        }
//        for (int i = 65; i <= 90; i++) {
//            if (alp[i] == max) {
//                maxCount++;
//            }
//        }
//
//        if (maxCount == 1) {
//            bw.write(index);
//        } else {
//            bw.write("?");
//        }
//        bw.flush();
//        bw.close();
//        br.close();
//    }

}
