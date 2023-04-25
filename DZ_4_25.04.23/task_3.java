import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class task_3 {

    static Stack<String> operationsHistory = new Stack<>();

    static void logOperation(double num1, double num2, char op, double result) {
        String logMsg = String.format("%.2f %c %.2f = %.2f", num1, op, num2, result);
        try {
            FileWriter writer = new FileWriter("log.txt", true);
            writer.write(logMsg + "\n");
            writer.close();
            operationsHistory.push(logMsg);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл.");
            e.printStackTrace();
        }
    }

    static double executeOperation(char op, double num1, double num2) {
        double result = 0;
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
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = 0, num2 = 0, result = 0;
        char op;
        boolean continueCalculations = true;

        while (continueCalculations) {
            System.out.print("Введите первое число: ");
            num1 = input.nextDouble();
            System.out.print("Введите операцию (+, -, *, /) или 'c' для отмены последней операции: ");
            op = input.next().charAt(0);

            if (op == 'c') {
                if (operationsHistory.isEmpty()) {
                    System.out.println("Нет операций для отмены.");
                } else {
                    String lastOperation = operationsHistory.pop();
                    String[] operands = lastOperation.split(" ");
                    num1 = Double.parseDouble(operands[0]);
                    op = operands[1].charAt(0);
                    num2 = Double.parseDouble(operands[2]);
                    result = Double.parseDouble(operands[4]);
                    System.out.println("Отменено: " + lastOperation);
                }
            } else {
                System.out.print("Введите второе число: ");
                num2 = input.nextDouble();
                result = executeOperation(op, num1, num2);
                logOperation(num1, num2, op, result);
                System.out.println("Результат: " + result);
            }

            System.out.print("Хотите продолжить вычисления? (y/n): ");
            String continueStr = input.next();
            continueCalculations = continueStr.equals("y");
        }
        input.close();
    }
}
