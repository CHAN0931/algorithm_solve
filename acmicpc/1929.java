import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int[] prime = new int[n + 1];
        int i, j;
        for(i = 0; i <= n; i++) prime[i] = 0;
        prime[1] = 1;
        for(i = 2; i <= n; i++){
            for(j = 2; i * j <= n; j++){
                prime[i*j] = 1;
            }
        }
        for(i = m; i <= n; i++)
            if(prime[i] != 1)
                System.out.println(i);
    }
}
