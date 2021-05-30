import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        if(x >= 1 && y >= 1)
            System.out.println("1");
        if(x >= 1 && y < 1)
            System.out.println("4");
        if(x < 1 && y >= 1)
            System.out.println("2");
        if(x < 1 && y < 1)
            System.out.println("3");
    }
}
