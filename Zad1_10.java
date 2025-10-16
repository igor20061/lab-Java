//Многократный вызов.
//Дана сигнатура метода: public int lastNumSum(int a, int b)
//Необходимо реализовать метод таким образом, чтобы он считал сумму цифр
//двух чисел из разряда единиц. Выполните с его помощью последовательное
//сложение пяти чисел и результат выведите на экран. Постарайтесь выполнить
//задачу, используя минимально возможное количество вспомогательных
//переменных.
//
//Пример:
//5+11 это 6
//6+123 это 9
//9+14 это 13
//13+1 это 4
//Итого 4
import java.util.Scanner;

public class Zad1_10 {
    public int lastNumSum(int a, int b){
        while (a>=10){
            a = Math.abs(a) / 10;
        }
        return a+Math.abs(b)%10;
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
        Zad1_10 program = new Zad1_10();
        int a = program.getValidInt(scanner,"Введите первое число - ");
        int b = program.getValidInt(scanner,"Введите второе число - ");
        System.out.println(a + "+" + b + " = " + program.lastNumSum(a,b));
        a = program.lastNumSum(a,b);
        b = program.getValidInt(scanner,"Введите число - ");
        System.out.println(a + "+" + b + " = " + program.lastNumSum(a,b));
        a = program.lastNumSum(a,b);
        b = program.getValidInt(scanner,"Введите число - ");
        System.out.println(a + "+" + b + " = " + program.lastNumSum(a,b));
        a = program.lastNumSum(a,b);
        b = program.getValidInt(scanner,"Введите число - ");
        System.out.println(a + "+" + b + " = " + program.lastNumSum(a,b));
        System.out.println("Итого: " + program.lastNumSum(a,b));

    }
}
