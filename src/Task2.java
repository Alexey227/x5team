import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите трехзначное число и будет выведена сумма значений числа: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = 0;
        while (a > 0) {
            b += a % 10;
            a /= 10;
        }
        System.out.println("Сумма значений числа: " + b);
    }
}

