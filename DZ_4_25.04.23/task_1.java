// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;

public class task_1 {

    static LinkedList reverseLinkedList(LinkedList list) {
        LinkedList reversedList = new LinkedList();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");

        LinkedList<String> reversedList = reverseLinkedList(myList);
        System.out.println(reversedList);
    }
}

