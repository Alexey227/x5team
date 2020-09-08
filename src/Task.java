import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int count = a % 10;
        System.out.println(count);
    }
}
