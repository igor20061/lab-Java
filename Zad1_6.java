//Большая буква.
//Дана сигнатура метода: public bool isUpperCase (char x);
//Необходимо реализовать метод таким образом, чтобы он принимал символ x и
//возвращал true, если это большая буква в диапазоне от ‘A’ до ‘Z’.
//
//Пример 1:
//x=’D’
//результат: true
//
//Пример 2:
//x=’q’
//результат: false
import java.util.Scanner;
public class Zad1_6 {
    public boolean isUpperCase (char x){
        return (x >= 'A' && x <= 'Z');
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
        Zad1_6 program = new Zad1_6();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите заглавную букву: ");
        String word = scanner.nextLine();
        char letter = word.charAt(0);
        System.out.print(program.isUpperCase(letter));
    }
}
