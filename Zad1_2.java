//Сумма знаков.
//Дана сигнатура метода: public int sumLastNums (int x);
//Необходимо реализовать метод таким образом, чтобы он возвращал результат
//сложения двух последних знаков числах, предполагая, что знаков в числе не
//менее двух. Подсказки:
//int x=123%10; // х будет иметь значение 3
//int у=123/10; // у будет иметь значение 12
//Пример:
//x=4568
//результат: 14

import java.io.ObjectInputValidation;
import java.util.Scanner;
public class Zad1_2 {
    public int sumLastNums (int x) {
        return (Math.abs(x) % 10) + ((Math.abs(x) % 100) / 10);
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
        Zad1_2 program = new Zad1_2();
        Scanner scanner = new Scanner(System.in);

        int number = program.getValidInt(scanner, "Введите число больше 100 - ");

        if (number <= 100) {
            System.out.println("Число должно быть больше 100");

        }
        else {
            System.out.println("Результат - " + program.sumLastNums(number));

        }

        }

}
