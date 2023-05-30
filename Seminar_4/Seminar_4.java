import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Seminar_4 {
    public static void main(String[] args) {
        // Замерить время, затрачиваемое на заполнение ArrayList и LinkedList 1_000_000 элементов
        ArrayList<Integer> arrayFirst = new ArrayList<>();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) arrayFirst.add(i);
        System.out.println(System.currentTimeMillis() - timeStart);
        LinkedList<Integer> arraySecond = new LinkedList<>();
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) arraySecond.add(i);
        System.out.println(System.currentTimeMillis() - timeStart);

        // Реализовать консольное приложение которое принимает от пользователя строку вида text.
        // Сохранить text в связный список. если введено print-num, выводит строку из позиции
        // num в связном списке и удаляет её из списка
        LinkedList<String> array = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.printf("Enter text: ");
            String temp = scan.nextLine();
            if (temp.toLowerCase().equals("stop")) break;
            else if (temp.contains("print~")) {
                if (Integer.parseInt(temp.split("~")[1]) < array.size()) {
                    System.out.println(array.get(Integer.parseInt(temp.split("~")[1])));
                    array.remove(Integer.parseInt(temp.split("~")[1]));
                    System.out.println(array);
                    continue;
                }
            }
            array.add(temp);
            System.out.println(array);
        }

        // Реализовать консольное приложение, которое:
        // принимает от пользователя и запоминает строки
        // если введено "print" выводит строки так чтобы последняя введённая была первой в списке, а первая - последней
        Stack stack = new Stack<>();
        while (true) {
            System.out.printf("Пожалуйста, введите что-то: ");
            String inputText = scan.next();
            if (inputText.toLowerCase().equals("print")) {
                for (int i = 0; i < stack.size();) System.out.println(stack.pop());
                continue;
            }
            stack.add(inputText);
            // System.out.println(stack);
        }
    }
}
