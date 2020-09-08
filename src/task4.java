import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if (number == 0) {
            System.out.println("10");
        } else if (number > 0) {
            System.out.println(number + 1);
        } else if (number < 0) {
            System.out.println(number - 2);
        }
    }
}