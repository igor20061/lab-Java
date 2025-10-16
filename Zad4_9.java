//Все вхождения.
//Дана сигнатура метода: public int[] findAll (int[] arr, int x);
//Необходимо реализовать метод таким образом, чтобы он возвращал новый
//массив, в котором записаны индексы всех вхождений числа x в массив arr.
//Пример:
//arr=[1,2,3,8,2,2,9]
//x=2
//результат: [1,4,5]
import java.util.Scanner;
import java.util.Arrays;

public class Zad4_9 {
    public void arrPrint(int[] arr) {
        System.out.print("массив: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public int[] findAll(int[] arr, int x) {
        // Сначала подсчитаем количество вхождений
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        // Создаем массив нужного размера
        int[] newArr = new int[count];

        // Заполняем массив индексами, где найден элемент x
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                newArr[index] = i; // сохраняем индекс, а не значение
                index++;
            }
        }
        return newArr;
    }

    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zad4_9 program = new Zad4_9();

        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Количество элементов должно быть положительным числом!");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        program.arrPrint(arr);

        System.out.print("Введите число для поиска: ");
        int x = scanner.nextInt();

        int[] result = program.findAll(arr, x);
        System.out.println("Индексы, где найден элемент " + x + ": " + Arrays.toString(result));
    }
}