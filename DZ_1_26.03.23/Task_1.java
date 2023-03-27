import java.util.Scanner;


public class Task_1 {

    // ============== рекурсия + тернарник ===================
    public static int TriangleRec(int num) {
        return num == 1 ? 1 : num + TriangleRec(num - 1);
    }
    public static int FactorialRec(int num) {
        return num < 1 ? 1 : num * FactorialRec(num - 1);
    }

    // ============== циклы ===================
    public static int Triangle(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }
    public static int Factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.printf("Введите число n >>> ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        System.out.println("Треугольное число от " + number + " рекурсией = " + TriangleRec(number));
        System.out.println("Треугольное число от " + number + " циклом = " + Triangle(number));
        System.out.println("Вычисление " + number + "! рекурсией: " + FactorialRec(number));
        System.out.println("Вычисление " + number + "! циклом: " + Factorial(number));

    }
}
