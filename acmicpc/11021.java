import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int[][] values = new int[Integer.parseInt(a)][2];
        for(int i = 0; i < values.length; i++){
            String[] s = br.readLine().split(" ");
            for(int j = 0; j < 2; j++)
                values[i][j] = Integer.parseInt(s[j]);
        }
        br.close();
        for(int i = 0; i < values.length; i++)
            System.out.println("Case #" + (i + 1) + ": " + (values[i][0] + values[i][1]));
    }
}
