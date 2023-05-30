import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Seminar_5 {
    static boolean IsoCheck(String strOne, String strTwo) {
        if (strOne.length() != strTwo.length()) return false;
        Map<Character, Character> chars = new HashMap<>();
        for (int i = 0; i < strOne.length(); i++) {
            if (chars.containsKey(strOne.charAt(i)) && chars.get(strOne.charAt(i)) != strTwo.charAt(i)) return false;
            chars.put(strOne.charAt(i), strTwo.charAt(i));
        }
        return true;
    }

    static boolean SkobkiCheck(String str) {
        Map<Character, Character> skobki = new HashMap<>();
        skobki.put('{', '}'); skobki.put('(', ')'); skobki.put('[', ']'); skobki.put('<', '>');
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (skobki.containsKey(str.charAt(i))) stack.add(str.charAt(i));
            if (skobki.containsValue(str.charAt(i)) && str.charAt(i) != skobki.get(stack.pop())) return false;
        }
        if (!stack.empty()) return false;
        return true;
    }

    public static void main(String[] args) {
        // Создать структуру для хранения номеров паспортов и фамилий сотрудников организации
        // 123456 Иванов
        // 321654 Петров
        // и т.д. Вывести данные по сотрудникам с фамилией Иванов
        Map<Integer, String> passports = new HashMap<>();
        passports.put(123456, "Иванов"); passports.put(234567, "Петров");
        passports.put(345678, "Сидоров"); passports.put(456789, "Иванов");
        passports.put(567890, "Тарасов"); passports.put(321654, "Иванова");
        passports.put(432765, "Чеченин"); passports.put(543876, "Мичуров");
        for (var kv: passports.entrySet()) {
            if (kv.getValue().equals("Иванов")) System.out.println(kv.getKey() + " " + kv.getValue());
        }

        // Даны 2 строки, написать метод, который вернёт true, если эти строки являются изоморфными и false если нет,
        // Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
        // 1. повторяющиеся буквы одного слова меняются на  одну и ту же букву с сохранением порядка следования,
        // 2. буква может не меняться, а оставаться такой же (note - code)
        // s = "foo", t = "bar" => false
        // s = "paper", t = "title" => true
        String wordOne = "paper";
        String wordTwo = "title";
        System.out.println(IsoCheck(wordOne, wordTwo));

        // определить правильность расстановки скобок в выражении
        // a+(d*3) {a}[+]{(d*3)} <{a}+{(d*3)}>  => true
        // [a+(1+3) [6+(]3*3) {a+]}{(d*3)} => false
        String averageTrue = "a+(d*3) {a}[+]{(d*3)} <{a}+{(d*3)}>";
        String averageFalse = "[a+(1+3) [6+(]3*3) {a+]}{(d*3)}";
        System.out.println(SkobkiCheck(averageTrue));
        System.out.println(SkobkiCheck(averageFalse));
    }
}