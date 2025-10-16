//Модуль числа.
//Дана сигнатура метода: public int abs (int x);
//Необходимо реализовать метод таким образом, чтобы он возвращал модуль
//числа х (если оно было положительным, то таким и остается, если он было
//отрицательным – то необходимо вернуть его без знака минус).
//
//Пример 1:
//x=5
//результат: 5
//
//Пример 2:
//x=-3
//результат: 3

import java.util.Scanner;

public class Zad2_1 {
    public int abs (int x){
        if (x>0){
            return x;
        }
        else{
            return x*-1;
        }
    }
    public int getValidInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите целое число.");
            }
        }
    }

    public static void main(String[] args){
        Zad2_1 program = new Zad2_1();
        Scanner scanner = new Scanner(System.in);
        int x = program.getValidInt(scanner,"Введите число - ");
        System.out.println("Модуль равен " + program.abs(x));
    }
}
