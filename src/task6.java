import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if (number == 0) {
            System.out.println("ноль");
        } else if (number < 0 && number % 2 == 0) {
            System.out.println("отрицательное четное число");
        } else if (number < 0 && number % 2 == 1) {
            System.out.println("отрицательное нечетное число");
        } else if (number > 0 && number % 2 == 0) {
            System.out.println("положительное четное число");
        } else if (number > 0 && number % 2 == 1) {
            System.out.println("положительное нечетное число");
        }
    }
}

