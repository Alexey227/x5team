import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;


public class task5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите три числа и программы выведет наименьшее из них: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a == b && b == c && a == c){
            System.out.println("Все числа равны, введите разные числа");
        }
        int answer = Math.min(a, Math.min(b, c));
        System.out.println(answer);
    }
}
