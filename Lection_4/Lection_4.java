public class Lection_4 {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        //==============================LINKED_LIST================================
        // Нужен для небольшого количества элементов в которых операции
        // добавления или удаления встречаются чаще операций чтения
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);

        //=============================QUEUE=======================================
        // первый пришёл = первый ушёл
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue); // [1, 2, 3, 4]
        int item = queue.remove();
        System.out.println(queue); // [2, 3, 4]
        queue.offer(2809);
        item = queue.remove();
        System.out.println(queue); // [3, 4, 2809]
        item = queue.remove();
        System.out.println(queue); // [4, 2809]
        item = queue.remove();
        System.out.println(queue); // [2809]
        System.out.println(queue.peek());

        //===========================PriorityQueue===============================
        // наивысший приоритет имеет наименьший элемент
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        //===========================DEQUE======================================
        // линейная коллекция, которая поддерживает вставку и удаление на обоих концах
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2);
        deque.removeLast(); deque.removeLast();
        deque.offerFirst(1); deque.offerLast(2);
        deque.pollFirst(); deque.pollLast();
        deque.getFirst(); deque.getLast();
        deque.peekFirst(); deque.peekLast();

        //==========================STACK=============================
        // Stack представляет собой обработку данных по принципу LIFO.
        // Расширяет Vector пятью операциями, которые позволяют рассматривать вектор как стек.
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println(stack.pop()); // 123
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1

        //====================================ПРИМЕР====================================
        // Вычислить значение выражения в постфиксной форме записи

        // (1+2*3*4)*(10/5) - 20
        // 1 2 3 * 4 * + 10 5 / * 20 -
        //var exp = "20 30 - 10 *".split(" "); // (20-30)*10
        var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3
        //var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3

        int res = 0;
        System.out.println(exp);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res =  st.pop()/ st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}












