// Пусть дан произвольный список целых чисел, удалить из него чётные числа
import java.util.*;


public class task_2 {

    static void removeEvenNumbers(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        removeEvenNumbers(numbers);
        System.out.println(numbers);
    }
}



