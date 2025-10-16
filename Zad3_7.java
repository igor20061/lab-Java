//Квадрат.
//Дана сигнатура метода: public void square (int x);
//Необходимо реализовать метод таким образом, чтобы он выводил на экран
//квадрат из символов ‘*’ размером х, у которого х символов в ряд и х символов в
//высоту.
//
//Пример 1:
//x=2
//результат:
//**
//**
//
//Пример 2:
//x=4
//результат:
//****
//****
//****
//****
import java.util.Scanner;

public class Zad3_7 {
    public void square (int x){
        for (int i = 0; i < x; i++) {
            String a = "*";
            System.out.println(a.repeat(x));
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


    public static void main(String[] args) {
        Zad3_7 program = new Zad3_7();
        Scanner scanner = new Scanner(System.in);
        int x = program.getValidInt(scanner,"Введите число - ");
        program.square(x);
    }
}
