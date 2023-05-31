import java.util.*;

public class Seminar_6 {

    static int[] ArrayCreate(Integer size, Integer min, Integer max) {
        int[] array = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) array[i] = rnd.nextInt(min, max + 1);
        return array;
    }

    static double UniquePercentage(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num: array) uniqueSet.add(num);
        return uniqueSet.size() * 100 / (double) array.length;
    }

    public static void main(String[] args) {
        // Создать HashSet LinkedHashSet и TreeSet, заполнить их {1, 2, 30000, 2, 4, 5000, 6, 3} и вывести на экран
        HashSet<Integer> myHash = new HashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        LinkedHashSet<Integer> myLinked = new LinkedHashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        TreeSet<Integer> myTree = new TreeSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        System.out.println(myHash);
        System.out.println(myLinked);
        System.out.println(myTree);
        System.out.println();

        // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 20
        // Создайте метод, в который передадите заполненный выше массив с помощью Set вычислите процент уникальных
        // значений в данном массиве и верните его в виде числа с плавающей запятой.
        // Для вычисления процента используйте формулу:
        // %(уник) = КОЛ(уник) * 100 / ОБШ(кол-во числел)
        int[] myArray = ArrayCreate(110, 0, 70);
        //for (int number: myArray) System.out.print(number + " ");
        System.out.printf("В данном массиве %.2f %% уникальных чисел.", UniquePercentage(myArray));
    }
}
