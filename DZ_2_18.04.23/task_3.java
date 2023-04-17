// К калькулятору из предыдущего дз добавить логирование.
//        1 + 3 = 4
//        4 + 3 = 7

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task_3 {

    static void logOperation(double num1, double num2, char op, double result) {
        String logMsg = String.format("%.2f %c %.2f = %.2f", num1, op, num2, result);
        try {
            FileWriter writer = new FileWriter("log.txt", true);
            writer.write(logMsg + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл.");
            e.printStackTrace();
        }
    }

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

        logOperation(num1, num2, op, result);
        System.out.println("Результат: " + result);

    }
}


