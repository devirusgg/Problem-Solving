import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bojB2_1152 {   // 단어의 개수

    public static void main(String[] args) throws IOException {
        new bojB2_1152().solution();
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        System.out.println(st.countTokens());   // 더 빨랐음
//        bw.write(String.valueOf(st.countTokens()));
//        bw.flush();
//        bw.close();
    }

}
