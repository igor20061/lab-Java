//Строка сравнения.
//Дана сигнатура метода: public String makeDecision (int x, int y);
//Необходимо реализовать метод таким образом, чтобы он возвращал строку,
//которая включает два принятых методом числа и корректно выставленный
//знак операции сравнения (больше, меньше, или равно).
//
//Пример 1:
//x=5  y=7
//результат: “5< 7”
//
//Пример 2:
//x=8  y=-1
//результат: “8 >-1”
//
//Пример 3:
//x=4  y=4
//результат: “4==4”
import java.util.Scanner;

public class Zad2_4 {
    public String makeDecision (int x, int y) {
        String a = String.valueOf(x);
        String b = String.valueOf(y);
        if (x > y) {
            return a + ">" + b;
        } else {
            if (x == y) {
                return a + "=" + b;
            } else {
                return a + "<" + b;
            }


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
        Zad2_4 program = new Zad2_4();
        Scanner scanner = new Scanner(System.in);
        int x = program.getValidInt(scanner,"Введите 1 число - ");
        int y = program.getValidInt(scanner,"Введите 2 число - ");;

        System.out.println(program.makeDecision(x,y));


        }

}
