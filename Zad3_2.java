//результат: “0 1 2 3 4 5”
//2 Числа наоборот.
//Дана сигнатура метода: public String reverseListNums (int x);
//Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
//которой будут записаны все числа от x до 0 (включительно).
//
//Пример:
//x=5
//результат: “5 4 3 2 1 0”
import java.util.Scanner;

public class Zad3_2 {
    // Убираем static из метода
    public String reservelistNums(int x) {
        String a = "";
        while (x >= 0) {
            a = a + String.valueOf(x) + " ";
            x = x - 1;
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
        Zad3_2 program = new Zad3_2();
        Scanner scanner = new Scanner(System.in);
        int x = program.getValidInt(scanner,"Введите число - ");

        System.out.println(program.reservelistNums(x));

        scanner.close();
    }
}