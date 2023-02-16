import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BojS4_1920 {   // 수 찾기

    public static void main(String[] args) throws IOException {
        new BojS4_1920().solution();
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
//            if (Arrays.binarySearch(A, Integer.parseInt(st.nextToken())) >= 0) {    // Arrays 라이브러리 메소드
            if (binarySearch(A, Integer.parseInt(st.nextToken()))) {  // 구현 메소드
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.print(sb);
    }

    private boolean binarySearch(int[] arr, int findNum) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (findNum == arr[mid]) {
                return true;
            } else if (findNum > arr[mid]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
    }
    // 완전탐색 (시간초과)
//    private void solution() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//
//        int N = Integer.parseInt(br.readLine());
//        int[] A = new int[N];
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < N; i++) {
//            A[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(A);
//
//        int M = Integer.parseInt(br.readLine());
//        int[] MA = new int[M];
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < M; i++) {
//            MA[i] = Integer.parseInt(st.nextToken());
//        }
//
//        for (int i = 0; i < M; i++) {
//            int lo = 0;
//            int hi = N - 1;
//            int mid = (lo + hi) / 2;
//            boolean isExist = false;
//
//            while (lo <= hi) {
//                if (MA[i] == A[mid]) {
//                    isExist = true;
//                    break;
//                } else if (MA[i] > A[mid]) {
//                    lo = mid + 1;
//                    mid = (lo + hi) / 2;
//                } else {
//                    hi = mid - 1;
//                    mid = (lo + hi) / 2;
//                }
//            }
//
//            if (isExist) {
//                sb.append(1).append("\n");
//            } else {
//                sb.append(0).append("\n");
//            }
//        }
//        System.out.print(sb);
//    }

}
