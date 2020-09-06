public class task8a {
    public static void main(String[] args) {
        int number[] = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 0)
                sum += number[i];
        }
        System.out.println("Сумма положительных элементов: " + sum);
    }
}
