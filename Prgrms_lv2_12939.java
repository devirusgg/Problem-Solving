import java.util.Arrays;
import java.util.StringTokenizer;

public class Prgrms_lv2_12939 { // 최댓값과 최솟값

    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        int n = st.countTokens();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append(' ');
        sb.append(arr[arr.length - 1]);

        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        Prgrms_lv2_12939 problem = new Prgrms_lv2_12939();
        System.out.println(problem.solution("1 2 3 4"));
        System.out.println(problem.solution("-1 -2 -3 -4"));
        System.out.println(problem.solution("-1 -1"));
    }

}
