//Диапазон.
//Дана сигнатура метода: public bool isInRange (int a, int b, int num);
//Метод принимает левую и правую границу (a и b) некоторого числового
//диапазона. Необходимо реализовать метод таким образом, чтобы он возвращал
//true, если num входит в указанный диапазон (включая границы). Обратите
//внимание, что отношение a и b заранее неизвестно (неясно кто из них больше, а
//кто меньше)
//
//Пример 1:
//a=5 b=1 num=3
//результат: true
//
//Пример 2:
//a=2 b=15 num=33
//результат: false
import java.util.Scanner;
public class Zad1_7 {
    public boolean isInRange (int a, int b, int num){
        return (num >= a) && (num <= b);
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
        Scanner scanner = new Scanner(System.in);
        Zad1_7 program = new Zad1_7();
        System.out.println("Введите Диапозон");
        int a = program.getValidInt(scanner, "Введите Начальное число - ");
        System.out.println("Введите конечное число: ");
        int b = program.getValidInt(scanner, "Введите конечное число - ");
        System.out.println("Введите число в этом диапозоне: " + a + "-" + b);
        int number = program.getValidInt(scanner, "Введите число в этом диапозоне: " + a + "-" + b + " ");
        System.out.println(program.isInRange(a,b,number));



    }


}
