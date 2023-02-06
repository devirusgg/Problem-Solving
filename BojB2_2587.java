import java.io.*;
import java.util.Arrays;

public class BojB2_2587 {   // 대표값2

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[5];
        int avr = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            avr += arr[i];
        }
        Arrays.sort(arr);
        avr /= 5;
        bw.write(String.valueOf(avr));
        bw.newLine();
        bw.write(String.valueOf(arr[2]));
        bw.flush();
        bw.close();
    }

}
