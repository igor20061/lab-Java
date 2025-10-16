//День недели.
//Дана сигнатура метода: public String day (int x);
//Метод принимает число x, обозначающее день недели. Необходимо реализовать
//метод таким образом, чтобы он возвращал строку, которая будет обозначать
//текущий день недели, где 1- это понедельник, а 7 – воскресенье. Если число не
//от 1 до 7 то верните текст “это не день недели”. Вместо if в данной задаче
//используйте switch.
//
//Пример:
//x=5
//результат: “пятница”
import java.util.Scanner;

public class Zad2_9 {
    public String day(int x) {
        switch (x) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "это не день недели";
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
        Zad2_9 program = new Zad2_9();
        Scanner scanner = new Scanner(System.in);

        int x = program.getValidInt(scanner,"Введите день недели ввиде числа - ");;

        System.out.println(program.day(x));

    }
}