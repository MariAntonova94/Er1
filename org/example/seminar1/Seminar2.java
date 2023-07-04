package org.example.seminar1;
import java.util.Scanner;
public class Seminar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        String input = sc.nextLine();
        try {int age = Integer.parseInt(input);
            System.out.printf("Ваш возраст = %d", age);}
        catch (NumberFormatException e){
            throw new NumberFormatException("Некорректный ввод");
        }
    }
}