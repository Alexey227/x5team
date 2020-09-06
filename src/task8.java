import java.util.Arrays;
import java.util.Collections;

public class task8 {
    public static void main(String[] args) {
        Integer[] number = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        Arrays.sort(number, Collections.reverseOrder());
        System.out.println("Максимальное значение: " + number[0]);
            }
}

