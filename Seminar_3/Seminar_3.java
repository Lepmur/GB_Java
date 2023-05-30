import java.util.*;

public class Seminar_3 {
    public static void main(String[] args) {
        // заполнить список 10 разными числами и
        // отсортировать список методом sort() и вывести на экран
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            array.add(random.nextInt(0, 100));
        }
        System.out.println(array);
        array.sort(Comparator.reverseOrder()); // null / natural / reverse
        System.out.println(array + "\n");

        // Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями
        // вывести название каждой планеты и количество его повторений в списке
        String[] planets = {"Sun", "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune", "Plutonium"};
        ArrayList<String> randomPlanets = new ArrayList<String>();
        for (int i = 0; i < random.nextInt(1, 20); i++) {
            randomPlanets.add(planets[random.nextInt(0, 9)]);
        }
        randomPlanets.sort(null);
        System.out.println(randomPlanets);
        System.out.printf("%s - %d\n", randomPlanets.get(0), 1 + randomPlanets.lastIndexOf(randomPlanets.get(0)) - randomPlanets.indexOf(randomPlanets.get(0)));
        for (int i = 1; i < randomPlanets.size(); i++) {
            if (randomPlanets.get(i) != randomPlanets.get(i - 1)) {
                System.out.printf("%s - %d\n", randomPlanets.get(i), 1 + randomPlanets.lastIndexOf(randomPlanets.get(i)) - randomPlanets.indexOf(randomPlanets.get(i)));
            }
        }

        // Создать список типа ArrayList и поместить в него как строки так и целые числа
        // Пройти по списку и удалить все целые числа
        ArrayList<Object> myArray = new ArrayList<>(Arrays.asList(0, "хрен", 5, "редьки", 2, "слаще", 7));
        // for (int i = 0; i < myArray.size(); i++) if (myArray.get(i).getClass() == Integer.class) myArray.remove(i);
        Iterator<Object> iterator = myArray.iterator();
        while (iterator.hasNext()) if (iterator.next() instanceof Integer) iterator.remove();
        System.out.println(myArray);
    }
}