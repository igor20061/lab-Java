//Четные числа.
//Дана сигнатура метода: public String chet (int x);
//Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
//которой будут записаны все четные числа от 0 до x (включительно). Подсказа
//для обеспечения качества кода: инструкцию if использовать не следует.
//
//Пример:
//x=9
//результат: “0 2 4 6 8”
import java.util.Scanner;

public class Zad3_3 {
    public String chet(int x) {
        String a = "";
        for (int i = 0; i <= x; i += 2) {
            a = a + String.valueOf(i) + " ";
        }
        return a;
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

    public static void main(String[] args) {
        Zad3_3 program = new Zad3_3();
        Scanner scanner = new Scanner(System.in);
        int x = program.getValidInt(scanner,"Введите число - ");
        System.out.println(program.chet(x));
    }
}