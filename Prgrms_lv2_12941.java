import java.util.Arrays;

public class Prgrms_lv2_12941 { // 최솟값 만들기

    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int n = A.length;
        for (int i = 0; i < n; i++) {
            answer += (A[i] * B[n - 1 - i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Prgrms_lv2_12941 problem = new Prgrms_lv2_12941();
        System.out.println(problem.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
        System.out.println(problem.solution(new int[]{1, 2}, new int[]{3, 4}));
    }

}
