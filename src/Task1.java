import java.util.Scanner;

// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите число N: ");
        try (Scanner input = new Scanner(System.in)) {
            int userNumber = input.nextInt();
            int sum = 0;
            int fact = 1;
            for (int i = 1; i <= userNumber; i++) {
                sum += i;
                fact *= i;
            }
            System.out.printf("Треугольное число от N = %d\n", sum);
            System.out.printf("Факториал числа N = %d", fact);
        }
    }

}