import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        String tmp1 = null, tmp2 = null, result;

        if (number > 0) {
            tmp1 = "Положительное ";
        } else if (number < 0) {
            tmp1 = "Отрицательное ";
        }
        result = tmp1;
        if (number % 2 == 0 && number != 0) {
            tmp2 = "четное";
        } else if (number % 2 != 0) {
            tmp2 = "нечетное";
        }
        result += tmp2;
        if (number == 0) {
            result = "нулевое число";
        }
        System.out.println(result);
    }
}