//Угадайка.
//Дана сигнатура метода: public void guessGame()
//Необходимо реализовать метод таким образом, чтобы он генерировал
//случайное число от 0 до 9, далее считывал с консоли введенное пользователем
//число и выводил, угадал ли пользователь то, что было загадано, или нет. Метод
//запускается до тех пор, пока пользователь не угадает число. После этого
//выведите на экран количество попыток, которое потребовалось пользователю,
//чтобы угадать число.
//
//Пример:
//Введите число от 0 до 9:
//5
//Вы не угадали, введите число от 0 до 9:
//9
//Вы угадали!
//Вы отгадали число за 2 попытки
import java.util.Scanner;
import java.util.Random;

public class Zad3_10 {

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

    public void guessGame(){
        Zad3_10 program = new Zad3_10();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int RandomNumber = random.nextInt(10);
        int x = - 1;
        int i  = 0 ;
        while (x != RandomNumber){
            x = program.getValidInt(scanner,"Введи число от 0 до 9 - ");;
            i = i + 1;
            if (x == RandomNumber){
                System.out.println("Вы угадали число за "+i+" попыток");
            }
            else {
                System.out.println("Вы не угадали число");
            }
        }
    }
    public static void main(String[] args) {
        Zad3_10 program = new Zad3_10();
        program.guessGame ();
    }
}
