import java.util.Arrays;

public class Prgrms_lv2_70129 { // 이진 변환 반복하기

    public int[] solution(String s) {
        int idx = 0;
        long zeroCnt = 0;
        while (true) {
            zeroCnt += s.chars().filter((c) -> c == '0').count();   // stream 활용
//            zeroCnt += s.length() - s.replace("0", "").length();    // 평범한 방식
            s = s.replace("0", "");
            s = Integer.toBinaryString(s.length());
            idx++;
            if (s.equals("1")) {
                break;
            }
        }
        return new int[]{idx, (int) zeroCnt};
    }

    public static void main(String[] args) {
        Prgrms_lv2_70129 problem = new Prgrms_lv2_70129();
        System.out.println(Arrays.toString(problem.solution("110010101001")));
        System.out.println(Arrays.toString(problem.solution("01110")));
        System.out.println(Arrays.toString(problem.solution("1111111")));
    }

}
