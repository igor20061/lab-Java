//Возраст.
//Дана сигнатура метода: public String age (int x);
//Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
//которой сначала будет число х, а затем одно из слов:
//год
//года
//лет
//Слово “год” добавляется, если число х заканчивается на 1, кроме числа 11.
//Слово “года” добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел
//12, 13, 14.
//Слово “лет”добавляется во всех остальных случаях.
//Подсказка: оператор % позволяет получить остаток от деления.
//
//Пример 1:
//x=5
//результат: “5 лет”
//
//Пример 2:
//x=31
//результат: “31 год”
//
//Пример 3:
//x=44
//результат: “44 года”
import java.util.Scanner;

public class Zad2_8 {
    public String age (int x){
        String a = String.valueOf(x);
        if (x%10 == 1 && x != 11){
            return a +  " год";
        }
        else {
            if ((x%10 == 2 || x%10 == 3 || x%10 == 4) && (x!=12 && x!=13 && x!=14)){
                return a + " года";
            }
            else{
                return a + " лет";
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
    public static void main(String[] args) {
        Zad2_8 program = new Zad2_8();
        Scanner scanner = new Scanner(System.in);
        int x = program.getValidInt(scanner,"Введите возраст - ");;
        if (x<0){
            System.out.println("Нужно положительное число");
        }
        else {
            System.out.println(program.age(x));
        }

    }
}
