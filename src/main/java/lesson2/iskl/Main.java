package lesson2.iskl;

import java.util.InputMismatchException;
import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у
// пользователя ввод данных.
//
//Если необходимо, исправьте данный код
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
//
//Дан следующий код, исправьте его там, где требуется
// (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        vvodFloat(scanner);
    }
    static void vvodFloat(Scanner scanner) {
        float a = 0;
        int count = 0;
        while (count < 5){
            try {
                System.out.print("Введите число:\n");
                a = scanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("неверный формат");
                scanner.nextLine();
            }
            count ++;
        }


        System.out.println(a);
    }
}