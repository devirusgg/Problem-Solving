import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BojS5_1181 {   // 단어 정렬

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        String temp = "";

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        /*
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return Integer.compare(o1.length(), o2.length());
                }
            }
        });
         */
        sb.append(arr[0]).append("\n");
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i - 1];
            if (temp.equals(arr[i])) {
                continue;
            } else {
                sb.append(arr[i]).append("\n");
            }
        }
        System.out.print(sb);
    }

}
