import java.util.Scanner;

public class Seminar_2 {
    public static void main(String[] args) {

//=========Дано четное число n>0 и 2 символа C1 и С2. Ну жно вывести поочередно эти символы, начиная с C1 n раз========
//        System.out.printf("Введите четное число n (>0): ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        scanner.close();
//        Character c1 = 'a';
//        Character c2 = 'b';
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < number/2; i++) {
//            result.append(c1);
//            result.append(c2);
//        }
//        System.out.println(result);


//===================Напишите программу которая сжимает строку. Ввод: aaaabbbcaaa Вывод: a4b3ca3=======================
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите строку для сжатия: ");
//        String str = sc.nextLine();
//        sc.close();
//
//        StringBuilder result = new StringBuilder();
//        char prevChar = str.charAt(0);
//        int count = 1;
//
//        for (int i = 1; i < str.length(); i++) {
//            char currentChar = str.charAt(i);
//
//            if (currentChar == prevChar) {
//                count++;
//            } else {
//                result.append(prevChar);
//                if (count > 1) {
//                    result.append(count);
//                }
//                count = 1;
//                prevChar = currentChar;
//            }
//        }
//
//        result.append(prevChar);
//        if (count > 1) {
//            result.append(count);
//        }
//
//        System.out.println(result);


//=====Напишите метод который принимает на ввод String и возвращает boolean, является ли она палиндромом=========

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку для проверки на палиндромизьм: ");
        String input = scan.nextLine();
        scan.close();

        if (checkPalindrome(input)) System.out.print("Строка является палиндромом");
        else System.out.print("Строка не является палиндромом");



    }
    static boolean checkPalindrome(String input) {
        for (int i = 0; i < input.length()/2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) return false;
        }
        return true;
    }
}












