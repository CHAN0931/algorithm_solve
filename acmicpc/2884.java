import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int hour = Integer.parseInt(s[0]);
        int minutes = Integer.parseInt(s[1]);
        int temp;
        if(hour == 0){
            if(minutes < 45){
                temp = 45 - minutes;
                hour = 23;
                minutes = 60 - temp;
            }
            else {
                minutes = minutes - 45;
            }
        }
        else{
            if(minutes < 45){
                temp = 45 - minutes;
                hour--;
                minutes = 60 - temp;
            }
            else {
                minutes = minutes - 45;
            }
        }
        System.out.println(hour + " " + minutes);
    }
}
