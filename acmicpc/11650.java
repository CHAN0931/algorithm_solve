import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] nums = new int[n][2];
        for(int i = 0; i < n; i++){
            String[] s = br.readLine().split(" ");
            nums[i][0] = Integer.parseInt(s[0]);
            nums[i][1] = Integer.parseInt(s[1]);
        }
        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i][0] + " " + nums[i][1]);
        }
    }
}
