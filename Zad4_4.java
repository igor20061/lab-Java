//Добавление в массив.
//Дана сигнатура метода: public int[]add (int[] arr, int x, int pos);
//Необходимо реализовать метод таким образом, чтобы он возвращал новый
//массив, который будет содержать все элементы массива arr, однако в позицию
//pos будет вставлено значение x.
//
//Пример:
//arr=[1,2,3,4,5]
//x=9
//pos=3
//результат: [1,2,3,9,4,5]

import java.util.Scanner;

public class Zad4_4 {

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

    public void arrPrint(int[] arr){
        System.out.print("массив: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public int[] add(int[] arr, int x, int pos) {
        // Проверка корректности позиции
        if (pos < 0 || pos > arr.length) {
            throw new IllegalArgumentException("Некорректная позиция: " + pos);
        }

        // Создаем новый массив на 1 элемент больше
        int[] newArr = new int[arr.length + 1];

        // Копируем элементы до позиции вставки
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // Вставляем новый элемент
        newArr[pos] = x;

        // Копируем оставшиеся элементы
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }
    public static void main(String[] args) {
        Zad4_4 program = new Zad4_4();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов в массиве: ");
        int n =  program.getValidInt(scanner,"");

        // Проверка на корректный размер массива
        if (n <= 0) {
            System.out.println("Количество элементов должно быть положительным числом!");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = program.getValidInt(scanner,"");;
        }
        program.arrPrint(arr);


        System.out.println("Введи число которое хочешь вставить в массив");
        int x = program.getValidInt(scanner,"");
        System.out.println("Введи индекс массива куда хочешь вставить число");
        int pos =  program.getValidInt(scanner,"");
        if (0<= pos && pos <= n){
            arr = program.add(arr,x,pos);
            System.out.println("Массив после вставки");
            program.arrPrint(arr);
        }
        else{
            System.out.println("Неверно");
        }



    }
}

