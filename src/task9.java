import java.util.Arrays;

public class task9 {
    public static void main(String[] args) {
        int number[] = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        for (int i = 0; number.length/2 > i; i++) {
            int tmp = number[i];
            number[i] = number[number.length - i - 1];
            number[number.length - i - 1] = tmp;
        }
        System.out.println("Элементы массива в обратном порядке: " + Arrays.toString(number));
    }
}
