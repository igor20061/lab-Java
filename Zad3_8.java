//Левый треугольник.
//Дана сигнатура метода: public void leftTriangle (int x);
//Необходимо реализовать метод таким образом, чтобы он выводил на экран
//треугольник из символов ‘*’ у которого х символов в высоту, а количество
//символов в ряду совпадает с номером строки.
//
//Пример 1:
//x=2
//результат:
//*
//**
//
//Пример 2:
//x=4
//результат:
//*
//**
//***
//****
import java.util.Scanner;

public class Zad3_8 {
    public void  leftTriangle  (int x){
        String a = "";
        for (int i = 0; i < x; i++) {
             a = a + "*";
            System.out.println(a);
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
        Zad3_8 program = new Zad3_8();
        Scanner scanner = new Scanner(System.in);
        int x = program.getValidInt(scanner,"Введите число - ");
        program.leftTriangle (x);
    }
}
