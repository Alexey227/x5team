import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number =Integer.parseInt(reader.readLine());
        String s = "" + number;
        char a[] = s.toCharArray();
        int b = 0;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int t = (int) a[i] - 48;
            b = b + t;
        }
        System.out.println(b);
    }
}

