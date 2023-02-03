import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BojB2_2750 {   // 수 정렬하기

    public static void main(String[] args) throws IOException {
        new BojB2_2750().solution();
    }

//    private void solution() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int N = Integer.parseInt(br.readLine());
//        int[] arr = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        Arrays.sort(arr);
//        for (int i = 0; i < N; i++) {
//            sb.append(arr[i]).append("\n");
//        }
//        System.out.print(sb);
//    }

    // implement
    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < N; i++) {
            int temp = 0;
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }

}