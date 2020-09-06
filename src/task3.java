import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if (number >= 0){
            int b = number + 1;
            System.out.println("Число положительное, ваш результат: " +b);
        }else if (number < 0){
            System.out.println("Число отрицательное, ваш результат: " +number);
        }
    }
}
