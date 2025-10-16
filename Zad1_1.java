import java.util.Scanner;

public class Zad1_1 {
    public static double fraction (double x){
        return (x - (int)x);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        double number = scanner.nextDouble();
        System.out.print(fraction(number));
    }
}
