import java.io.*;

public class BojB1_4796 {   // 캠핑

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int order = 0;

        while (true) {
            String in = br.readLine();
            if (in.equals("0 0 0")) {
                break;
            }
            String[] input = in.split(" ");
            int l = Integer.parseInt(input[0]);
            int p = Integer.parseInt(input[1]);
            int v = Integer.parseInt(input[2]);
            order++;
            bw.write("Case ");
            bw.write(String.valueOf(order));
            bw.write(": ");
            bw.write(String.valueOf(maxUsing(l, p, v)));
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }

    private static int maxUsing(int l, int p, int v) {
        int result = 0;
        while (true) {
            if (v >= p) {
                v -= p;
                if (p >= l) {
                    result += l;
                }
            } else {
                if (l < v) {
                    result += l;
                } else {
                    result += v;
                }
                return result;
            }
        }
    }

}
