//Поиск максимального.
//Дана сигнатура метода: public int maxAbs (int[] arr);
//Необходимо реализовать метод таким образом, чтобы он возвращал
//наибольшее по модулю (то есть без учета знака) значение массива arr.
//
//Пример:
//arr=[1,-2,-7,4,2,2,5]
//результат: -7
import java.util.Scanner;
public class Zad4_3 {
    public int maxAbs (int[] arr){
        int maxAbsValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int currentAbs = Math.abs(arr[i]);
            int maxAbs = Math.abs(maxAbsValue);

            if (currentAbs > maxAbs) {
                maxAbsValue = arr[i];
            }
        }
        return maxAbsValue;
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
        Zad4_3 program = new Zad4_3();
        Scanner scanner = new Scanner(System.in);

        int n = program.getValidInt(scanner,"Введите количество элементов в массиве:");

        // Проверка на корректный размер массива
        if (n <= 0) {
            System.out.println("Количество элементов должно быть положительным числом!");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = program.getValidInt(scanner,"");
        }

        // Вывод введенного массива
        System.out.print("Введенный массив: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Максимальное число по модулю: " + program.maxAbs(arr));
    }
}