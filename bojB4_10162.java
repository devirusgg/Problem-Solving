import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bojB4_10162 {  // 전자레인지

    public static void main(String[] args) throws IOException {
        int a = 0;
        int b = 0;
        int c = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        br.close();

        while (true) {
            if (t >= 300) {
                t -= 300;
                a++;
            } else if (t >= 60) {
                t -= 60;
                b++;
            } else if (t >= 10) {
                t -= 10;
                c++;
            } else if (t == 0) {
                System.out.println(a + " " + b + " " + c);
                return;
            } else {
                System.out.println(-1);
                return;
            }
        }
    }

}
