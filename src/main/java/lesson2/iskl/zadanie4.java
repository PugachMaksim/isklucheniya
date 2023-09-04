package lesson2.iskl;

import java.util.Scanner;

//
//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class zadanie4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String ent = sc.nextLine();
        vvod(ent);
    }
    static void vvod(String a) throws Exception {
        if (a.equals("")){
            throw new Exception("пустые строки вводить нельзя");
        }
        System.out.println(a);
    }
}
