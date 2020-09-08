import java.util.Arrays;
import java.util.Collections;

public class task8 {
    public static void main(String[] args) {
        int[] numbers = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = numbers[0];
        int sumPositiv = 0, sumNegativeOdd = 0, countPosisitiv = 0;
        double avgNegativ = 0, sumNegativ = 0, countNegativ = 0;

        for (int number : numbers) {

            if (number > max) {
                max = number;
            }

            if (number > 0) {
                sumPositiv += number;
            }

            if (number < 0 && number % 2 != 0) {
                sumNegativeOdd += number;
            }

            if (number > 0) {
                countPosisitiv++;
            }

            if (number < 0) {
                sumNegativ += number;
                countNegativ++;
                avgNegativ = sumNegativ / countNegativ;
            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Сумма положительных элементов: " + sumPositiv);
        System.out.println("Сумма чётных отрицательных элементов: " + sumNegativeOdd);
        System.out.println("Количество положительных элементов: " + countPosisitiv);
        System.out.println("Среднее арефметическое отрицательных элементов: " + avgNegativ);
    }
}

