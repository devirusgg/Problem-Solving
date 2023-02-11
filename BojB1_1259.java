import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BojB1_1259 {   // 팰린드롬수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringBuilder sb = new StringBuilder();
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }
            for (int i = 0; i < input.length(); i++) {
                sb.append(input.charAt(input.length() - 1 - i));
            }
            String result = sb.toString();
            if (input.equals(result)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

}
