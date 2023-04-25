// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class task_2 {
    public static void main(String[] args) {
        Queue<String> myQueue = new Queue<>();

        myQueue.enqueue("A");
        myQueue.enqueue("B");
        myQueue.enqueue("C");

        System.out.println(myQueue.first()); // выводит "A"

        myQueue.dequeue();
        System.out.println(myQueue.first()); // выводит "B"

        System.out.println(myQueue.size()); // выводит "2"
    }
}

