import java.util.Scanner;


public class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;
        char op;

        System.out.print("Введите первое число: ");
        num1 = input.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): ");
        op = input.next().charAt(0);
        System.out.print("Введите второе число: ");
        num2 = input.nextDouble();
        input.close();

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Оператор введён неверно!");
                return;
        }

        System.out.println("Результат: " + result);
    }
}
