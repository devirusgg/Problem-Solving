import java.io.*;

public class BojB2_5585 {   // 거스름돈

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int pay = 1000 - Integer.parseInt(br.readLine());
        int count = exchange(pay);
        bw.write(String.valueOf(count));
        bw.close();
    }

    private static int exchange(int pay) throws IOException {
        int count = 0;
        while (true) {
            if (pay >= 500) {
                pay -= 500;
                count++;
            } else if (pay >= 100) {
                pay -= 100;
                count++;
            } else if (pay >= 50) {
                pay -= 50;
                count++;
            } else if (pay >= 10) {
                pay -= 10;
                count++;
            } else if (pay >= 5) {
                pay -= 5;
                count++;
            } else if (pay >= 1) {
                pay -= 1;
                count++;
            } else {
                return count;
            }
        }
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int pay = 1000 - Integer.parseInt(br.readLine());
//        int count = 0;
//        while (true) {
//            if (pay >= 500) {
//                pay -= 500;
//                count++;
//            } else if (pay >= 100) {
//                pay -= 100;
//                count++;
//            } else if (pay >= 50) {
//                pay -= 50;
//                count++;
//            } else if (pay >= 10) {
//                pay -= 10;
//                count++;
//            } else if (pay >= 5) {
//                pay -= 5;
//                count++;
//            } else if (pay >= 1) {
//                pay -= 1;
//                count++;
//            } else {
//                break;
//            }
//        }
//        bw.write(String.valueOf(count));
//        bw.close();
//    }

}
