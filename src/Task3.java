import java.util.Scanner;

//3. Реализовать простой калькулятор

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextInt();
        System.out.println("Введите операцию + - * /: ");
        char oper;
        oper = scanner.next().charAt(0);
        double res = 0;
        if (oper == '+') {
            res = num1 + num2;
        } else if (oper == '-') {
            res = num1 - num2;
        } else if (oper == '*') {
            res = num1 * num2;
        } else if (oper == '/') {
            res = num1 / num2;
        } else {
            System.out.println("Вы ввели неправильную операцию.");
        }
        System.out.printf("%s %c %s = %s", num1, oper, num2, res);
        scanner.close();
    }
}
