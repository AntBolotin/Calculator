import java.util.Scanner;

/**
 * Created by Antony Bolotin on 25.05.2018
 * @author AntBolotin
 */
public class Base {

    public static final void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      Здесь мы вводим первое число
        System.out.println("Введите первое число:");
        float a = scanner.nextFloat();

//      Здесь мы вводим второе число
        System.out.println("Введите второе число:");
        float b = scanner.nextFloat();

//      Здесь мы выбираем тип операции
        System.out.println("Выберите математическую операцию ( +, -, *, / ):");
        String c = scanner.next();

//      Здесь мы получаем ответ с 4 символами после запятой
        if (c.equals ("+" )){
            System.out.printf("Результат сложения: %.4f", (a + b));
        }else if (c.equals ("-" )){
            System.out.printf("Результат вычитания: %.4f", (a - b));
        }else if (c.equals  ("*" )){
            System.out.printf("Результат умножения: %.4f", (a * b));
        }else if (c.equals ("/" )) {
            System.out.printf("Результат деления: %.4f", (a / b));
        }else System.out.println("Данная операция не поддерживается.");

        scanner.close();
    }
}