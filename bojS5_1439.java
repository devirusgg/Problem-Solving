import java.io.*;
import java.util.StringTokenizer;

public class bojS5_1439 {   // 뒤집기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st0 = new StringTokenizer(s, "0");
        StringTokenizer st1 = new StringTokenizer(s, "1");
        System.out.println(Math.min(st0.countTokens(), st1.countTokens()));
    }

}
