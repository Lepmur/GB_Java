// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.


import java.util.*;

public class task_2 {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов");
        Map<String, Integer> nameCount = new HashMap<>();
        for (String employee : employees) {
            String firstName = employee.split(" ")[0];
            nameCount.put(firstName, nameCount.getOrDefault(firstName, 0) + 1);
        }
        List<Map.Entry<String, Integer>> sortedNames = new ArrayList<>(nameCount.entrySet());
        sortedNames.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for (Map.Entry<String, Integer> entry : sortedNames) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
