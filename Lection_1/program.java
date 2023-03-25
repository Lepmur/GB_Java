import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class program {
    public static void main(String[] args) {

//=================================ОБЩИЙ_СИНТАКСИС=================================================
//        System.out.println("Hello, world!");
//        String s = "10";
//        s += "20";
//        float f = 123.45f;
//        double d = 123.456;
//        char ch = '{';
//        boolean tada = true && false; // быстрый способ (возможность проверки только первого условия)
//        Integer a = 123;
//        Integer b = 123;
//        a = a-- - --a;
//        b = --b-b--;


//=================================ФОРМАТИРОВАННЫЙ_ВЫВОД=================================================
//        int a = 1, b = 2;
//        int c = a + b;
//        String res = a + " + " + b + " = " + c;
//        System.out.println(res);
//
//        int a = 1, b = 2;
//        int c = a + b;
//        String res = String.format("%d + %d = %d \n", a, b, c);
//        System.out.printf("%d + %d = %d \n", a, b, c);
//        System.out.println(res);
//
//        %d: целочисленных значений
//        %x: для вывода шестнадцатеричных чисел
//        %f: для вывода чисел с плавающей точкой
//        %e: для вывода чисел в экспоненциальной форме,
//            например, 3.1415e+01
//        %c: для вывода одиночного символа
//        %s: для вывода строковых значений
//
//        float pi = 3.1415f;
//        System.out.printf("%f\n", pi); // 3,141500
//        System.out.printf("%.2f\n", pi); // 3,14
//        System.out.printf("%.3f\n", pi); // 3,141
//        System.out.printf("%e\n", pi); // 3,141500e+00
//        System.out.printf("%.2e\n", pi); // 3,14e+00
//        System.out.printf("%.3e\n", pi); // 3,141e+00


//=================================ЧТЕНИЕ_С_КОНСОЛИ=================================================
//import java.util.Scanner;
//          ==========СТРОКИ==============
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("name: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Привет, %s!", name);
//        iScanner.close();
//          ==========ПРИМИТИВЫ===========
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        int x = iScanner.nextInt();
//        System.out.printf("double a: ");
//        double y = iScanner.nextDouble();
//        System.out.printf("%d + %f = %f", x, y, x + y);
//        iScanner.close();
//          =====ПРОВЕРКА_НА_СООТВЕТСТВИЕ_ПОЛУЧАЕМОГО_ТИПА========
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        boolean flag = iScanner.hasNextInt();
//        System.out.println(flag);
//        int i = iScanner.nextInt();
//        System.out.println(i);
//        iScanner.close();

//=================================НЕЯВНАЯ_ТИПИЗАЦИЯ=================================================
//        var a = 123;
//        System.out.println(a); // 123
//        var d = 123.456;
//        System.out.println(d); // 123.456
//        System.out.println(getType(a)); // Integer
//        System.out.println(getType(d)); // Double
//        d = 1022;
//        System.out.println(d); // 1022
//
//    }
//    static String getType(Object o){
//        return o.getClass().getSimpleName();
//    }


//=================================КЛАССЫ_ОБЁРТКИ=================================================
//    int -> Integer
//    short -> Short
//    long -> Long
//    byte -> Byte
//    float -> Float
//    double -> Double
//    char -> Character
//    boolean -> Boolean


//=================================МАССИВЫ=================================================
//        //=============ОДНОМЕРНЫЕ==============
//        int[] arr = new int[10];
//        System.out.println(arr.length); // 10
//        arr = new int[] { 1, 2, 3, 4, 5 };
//        System.out.println(arr.length); // 5
//
//        //=============МНОГОМЕРНЫЕ==============
//        int[] arr[] = new int[3][5];
//        for (int[] line : arr) {
//            for (int item : line) {
//                System.out.printf("%d ", item);
//            }
//            System.out.println();
//        }
//
//        int[][] arr = new int[3][5];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("%d ", arr[i][j]);
//            }
//            System.out.println();
//        }


//=================================ФУНКЦИИ_И_МЕТОДЫ=================================================
//        static void sayHi() {
//            System.out.println("hi!");
//        }
//
//        static int sum(int a, int b) {
//            return a+b;
//        }
//
//        static double factor(int n) {
//            if(n==1)return 1;
//            return n * factor(n-1);
//        }
//
//        public static void main(String[] args) {
//            sayHi(); // hi!
//            System.out.println(sum(1, 3)); // 4
//            System.out.println(factor(5)); // 120.0
//        }


//=================================ОПЕРАТОРЫ=================================================
//          ===========УСЛОВНЫЙ=============
//        int a = 1;
//        int b = 2;
//        int c;
//        if (a > b) {
//            c = a;
//        } else {
//            c = b;
//        }
//        System.out.println(c);
//
//        int a = 1;
//        int b = 2;
//        int c = 0;
//        if (a > b) c = a;
//        if (b > a) c = b;
//
//          ===========ТЕРНАРНЫЙ=============
//        int a = 1;
//        int b = 2;
//        int min = a < b ? a : b;
//        System.out.println(min);
//
//          ==========ОПЕРАТОР_ВЫБОРА==========
//        int mounth = value;
//        String text = "";
//        switch (mounth) {
//            case 1:
//                text = "Autumn";
//                break;
//            case 2:
//            case 3:
//            case 4:
//                text = "blabla";
//                break;
//            default:
//                text = "mistake";
//                break;
//        }
//        System.out.println(text);
//        iScanner.close();


//=================================ЦИКЛЫ=================================================
//          ===========WHILE=============
//        int value = 321;
//        int count = 0;
//        while (value != 0) {
//            value /= 10;
//            count++;
//        }
//        System.out.println(count);
//
//          ===========DO_WHILE=============
//        int value = 321;
//        int count = 0;
//        do {
//            value /= 10;
//            count++;
//        } while (value != 0);
//        System.out.println(count);
//
//          ===========FOR=============
//        int s = 0;
//        for (int i = 1; i <= 10; i++) {
//            s += i;
//        }
//        System.out.println(s);
//
//          ===========FOREACH=============
//        int arr[] = new int[10];
//        for (int item : arr) {
//            System.out.printf("%d ", item);
//        }
//        System.out.println();


//==========================РАБОТА_С_ФАЙЛАМИ=================================================
//          ===========СОЗДАНИЕ_И_ЗАПИСЬ\ДОЗАПИСЬ=============
//import java.io.FileWriter;
//import java.io.IOException;
//
//        try (FileWriter fw = new FileWriter("file.txt", false)) {
//            fw.write("line 1");
//            fw.append('\n');
//            fw.append('2');
//            fw.append('\n');
//            fw.write("line 3");
//            fw.flush();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//          ===========ЧТЕНИЕ_ВАРИАНТ_ПОСИМВОЛЬНО=============
//import java.io.*;
//
//    public static void main(String[] args) throws Exception {
//
//        FileReader fr = new FileReader("file.txt");
//        int c;
//        while ((c = fr.read()) != -1) {
//            char ch = (char) c;
//            if (ch == '\n') {
//                System.out.print(ch);
//            } else {
//                System.out.print(ch);
//            }
//        }
//
//          ===========ЧТЕНИЕ_ВАРИАНТ_ПОСТРОЧНО=============
//import java.io.*;
//
//    public static void main(String[] args) throws Exception {
//
//        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//        String str;
//        while ((str = br.readLine()) != null) {
//            System.out.printf("== %s ==\n", str);
//        }
//        br.close();


//==========================ЗАДАЧКИ=================================================

//        Задана натуральная степень k. Сформировать случайным
//        образом список коэффициентов (значения от 0 до 100)
//        многочлена многочлен степени k.
//        *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0




//        Даны два файла, в каждом из которых находится запись
//        многочлена. Сформировать файл содержащий сумму
//        многочленов.




    }
}

