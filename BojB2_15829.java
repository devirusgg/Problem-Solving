import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BojB2_15829 {  // Hashing

    public static void main(String[] args) throws IOException {
        new BojB2_15829().solution();
    }

    // a: 97 , z: 122
    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] arr = new int[L];
        long hash = 0;
        long r = 1L;

        for (int i = 0; i < L; i++) {
            arr[i] = (int) str.charAt(i) - 96;
        }
        for (int i = 0; i < L; i++) {
            long result = arr[i] * r;
            hash += result;
            r = (r * 31) % 1234567891;
        }
        System.out.println(hash % 1234567891);
    }

    private void solution_b() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] arr = new int[L];
        BigInteger hash = BigInteger.valueOf(0);
        BigInteger r = BigInteger.valueOf(1);

        for (int i = 0; i < L; i++) {
            arr[i] = (int) str.charAt(i) - 96;
        }
        for (int i = 0; i < L; i++) {
            BigInteger result = BigInteger.valueOf(arr[i]).multiply(r);
            hash = hash.add(result);
            r = r.multiply(BigInteger.valueOf(31));
        }
        System.out.println(hash.remainder(BigInteger.valueOf(1234567891)));
    }

}
