//Тройной максимум.
//Дана сигнатура метода: public int max3 (int x, int y, int z);
//Необходимо реализовать метод таким образом, чтобы он возвращал
//максимальное из трех полученных методом чисел. Подсказка: идеальное
//решение включает всего две инструкции if и не содержит вложенных if.
//
//Пример 1:
//x=5  y=7  z=7
//результат: 7
//
//Пример 2:
//x=8  y=-1  z=4
//результат: 8
import java.util.Scanner;

public class Zad2_5 {
    public int max3(int x, int y, int z) {
        if (x >= y && x >= z) return x;
        if (y >= z) return y;
        return z;
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
        Zad2_5 program = new Zad2_5();
        Scanner scanner = new Scanner(System.in);
        int x = program.getValidInt(scanner,"Введите 1 число - ");
        int y = program.getValidInt(scanner,"Введите 2 число - ");
        int z = program.getValidInt(scanner,"Введите 3 число - ");

        System.out.println("Максильное число " + program.max3(x, y, z));
    }
}
