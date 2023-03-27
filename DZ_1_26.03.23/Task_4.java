import java.util.Scanner;


public class Task_4 {

    static boolean isSolutionCorrect(String numberOne, String numberTwo, String answer) {
        return Integer.parseInt(numberOne) + Integer.parseInt(numberTwo) == Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        System.out.printf("Введите уравнение вида 2? + ?5 = 69: ");
        Scanner input = new Scanner(System.in);
        String equation = input.nextLine();
        input.close();

        String[] parts = equation.split(" ");

        for (int i = 0; i < 10; i++) {
            String tempOne = parts[0].replace("?", Integer.toString(i));
            String tempTwo = parts[2].replace("?", Integer.toString(i));
            String tempAnswer = parts[4].replace("?", Integer.toString(i));
            if (isSolutionCorrect(tempOne, tempTwo, tempAnswer)) {
                parts[0] = tempOne; parts[2] = tempTwo; parts[4] = tempAnswer;
                String result = String.format("%s + %s = %s", parts[0], parts[2], parts[4]);
                System.out.println("Данное уравнение возможно в следующем случае: " + result);
                return;
            }
        }
        System.out.printf("Такое уравнение невозможно!");
    }
}
