public class Task_2 {

    static boolean SimpleCheck(int number) {
        if (number == 1 || number == 2) return true;
        for (int i = 2; i <= number/2; i++) {
            if (number%i == 0) return false;
        }
        return true;
    }

    public static String SimpleNumbers(int startNumber, int endNumber) {
        String result = "";
        for (int i = startNumber; i <= endNumber; i++) {
            if (SimpleCheck(i)) result += i + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(SimpleNumbers(1, 1000));
    }
}


