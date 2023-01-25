//2. Вывести все простые числа от 1 до 1000
public class Task2 {
    public static void main(String[] args) {
        boolean s = true;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    s = false;
                    break;
                }
            }
            if (s) System.out.println(i);
            else s = true;
        }
    }
}
