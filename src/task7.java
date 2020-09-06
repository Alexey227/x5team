import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
В этой задаче меня смутил пункт про вычисление стоимости 10 минутного разговара.
В условии пользователь вводит только код города и всё.
Значит вычислять 10 минут как бы и не нужно. Руководствовался этим.
*/

public class task7 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        switch (number) {
            case 905:
                System.out.println("Москва. Стоимость разговора: 41.5");
                break;
            case 194:
                System.out.println("Ростов. Стоимость разговора: 19.8");
                break;
            case 491:
                System.out.println("Краснодар. Стоимость разговора: 26.9");
                break;
            case 800:
                System.out.println("Киров. Стоимость разговора: 50.0");
                break;
            default:
                System.out.println("В базе отсутствует выбранный код города");
        }
    }
}
