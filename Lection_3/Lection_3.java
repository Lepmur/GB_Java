public class Lection_3 {
    static void GetType(Object obj) {                  // func for print type of object
        System.out.println(obj.getClass().getName());
    }

    static int[] AddItem(int[] array, int item) {      // func for added new item in the array
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
    public static void main(String[] args) {

        //======================================OBJECT=======================================

        Object o = 1; GetType(o); // java.lang.Integer
        o = 1.2; GetType(o); // java.lang.Double

        //=======================================ARRAY=======================================

        int[] a = new int[] { 0, 9 };
        for (int i : a) { System.out.printf("%d ", i); }
        a = AddItem(a, 2);
        a = AddItem(a, 3);
        for (int j : a) { System.out.printf("%d ", j); }

        //====================================ARRAY_LIST=====================================

        /*
        add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
        get(pos) – возвращает элемент из списка по указанной позиции
        indexOf(item) – первое вхождение или -1
        lastIndexOf(item) – последнее вхождение или -1
        remove(pos) – удаление элемента на указанной позиции и его возвращение
        set(int pos, T item) – gjvtoftn значение item элементу, который находится
        на позиции pos
        void sort(Comparator) – сортирует набор данных по правилу
        subList(int start, int end) – получение набора данных от позиции start до end

        clear() – очистка списка
        toString() – «конвертация» списка в строку
        Arrays.asList – преобразует массив в список
        containsAll(col) – проверяет включение всех элементов из col
        removeAll(col) – удаляет элементы, имеющиеся в col
        retainAll(col) – оставляет элементы, имеющиеся в col
        toArray() – конвертация списка в массив Object’ов
        toArray(type array) – конвертация списка в массив type
        List.copyOf(col) – возвращает копию списка на основе имеющегося
        List.of(item1, item2,...) – возвращает неизменяемый список
         */

        ArrayList list = new ArrayList();
        //               УДОБНЫЙ_МАССИВ
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10);
        ArrayList<Integer> list4 = new ArrayList<>(list3);
        //               КОЛЛЕКЦИИ_ROW_TYPE
        List list = new ArrayList();
        list.add(2809);
        list.add("string line");
        for (Object o : list) {
            System.out.println(o);
            // Проблема извлечения данных
        }
        //               КОЛЛЕКЦИИ_SAVE_TYPE
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(123);
        list.add("string line");
        for (Object o : list) {
            System.out.println(o);
            // Проблема извлечения данных
        }

        //              ПРИМЕРЫ
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]

        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = { day, month, year };
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]
        date[1] = new StringBuilder("09");
        System.out.println(d); // [29, 09, 1990]

        //               ИТЕРАТОР
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);
        for (int item : list) { System.out.println(item); }
        Iterator<Integer> col = list.iterator();
        while (col.hasNext()) {
            //System.out.println(col.next());
            col.next();
            col.remove();
        }
    }
}












