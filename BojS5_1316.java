import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BojS5_1316 {   // 그룹 단어 체커

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = N;
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            Set<Character> word = new HashSet<>();

            for (int j = 0; j < input.length(); j++) {
                if (j == 0) {
                    word.add(input.charAt(j));
                } else {
                    if (input.charAt(j - 1) != input.charAt(j)) {
                        if (word.contains(input.charAt(j))) {
                            cnt--;
                            break;
                        } else {
                            word.add(input.charAt(j));
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }

}
