import java.util.Scanner;
import java.util.Stack;

public class task_3 {
    private static Stack<Double> resultStack;

    public static void main(String[] args) {
        resultStack = new Stack<>();
        Scanner input = new Scanner(System.in);
        double num1, num2, result = 0.0;
        char op;
        boolean hasResult = false;

        while (true) {
            if (hasResult) {
                System.out.print("Введите операцию (+, -, *, /, u для отмены): ");
                op = input.next().charAt(0);

                if (op == 'u') {
                    if (!resultStack.isEmpty()) {
                        result = resultStack.pop();
                        System.out.println("Отмена операции. Предыдущий результат: " + result);
                    } else {
                        System.out.println("Нет доступной операции для отмены.");
                    }
                    continue;
                }

                System.out.print("Введите следующее число: ");
                if (input.hasNextDouble()) {
                    num1 = result;
                    num2 = input.nextDouble();

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
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                System.out.println("Ошибка: деление на ноль!");
                                continue;
                            }
                            break;
                        default:
                            System.out.println("Оператор введен неверно!");
                            continue;
                    }

                    System.out.println("Результат: " + result);
                    resultStack.push(result);
                    hasResult = true;
                } else {
                    System.out.println("Неверный формат числа. Попробуйте снова.");
                    input.next();
                }
            } else {
                System.out.print("Введите первое число (или 'q' для выхода): ");
                if (input.hasNextDouble()) {
                    num1 = input.nextDouble();
                    hasResult = true;
                    result = num1;
                } else if (input.hasNext("q")) {
                    System.out.println("Выход из программы.");
                    break;
                } else {
                    System.out.println("Неверный формат числа. Попробуйте снова.");
                    input.next();
                }
            }
        }

        input.close();
    }
}
