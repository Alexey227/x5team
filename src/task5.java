import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;
import java.util.Scanner;


public class task5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите три числа и программы выведет наименьшее из них: ");
        Scanner scan = new Scanner(System.in);
        int minimum = Integer.MAX_VALUE;
        int count = 0;
        while (count < 3) {
            int value = Integer.parseInt(scan.nextLine());

            if (value < minimum) minimum = value;
            count++;
        }
        System.out.println("Наименьшая число: " + minimum);
    }
}


