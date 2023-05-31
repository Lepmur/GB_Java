// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавление номера, вывод всей книги


import java.util.*;

public class task_1 {

    static void addNewContact(Map<String, ArrayList<String>> phoneBook, String name, Integer numberOne, Integer numberTwo) {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add(numberOne.toString());
        numbers.add(numberTwo.toString());
        phoneBook.put(name, numbers);
        System.out.println("\nNew contact added successful.\n");
    }

    static void showAllBook(Map<String, ArrayList<String>> phoneBook) {
        System.out.println();
        for (String name : phoneBook.keySet()) System.out.println("Name: " + name + " Numbers: " + phoneBook.get(name));
        System.out.println();
    }

    public static void main(String[] args) {
        Map<String , ArrayList<String>> phonebook = new HashMap<>();
        Map<Integer, String> menu = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        Integer choice = null;
        //Menu

        do {
            System.out.println("Menu:");
            System.out.println("1. Add a contact");
            System.out.println("2. Display contacts");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input! Please enter a valid integer.\n");
                sc.nextLine();
            }
            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.printf("Enter Name for new contact: ");
                    String newName = sc.next();
                    sc.nextLine();
                    Integer newNumberOne = null;
                    Integer newNumberTwo = null;
                    System.out.printf("Enter First Number for %s: ", newName);
                    try {
                        newNumberOne = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("\nInvalid input! Please enter a valid integer.\n");
                        sc.nextLine();
                        break;
                    }
                    System.out.printf("Enter Second Number for %s: ", newName);
                    try {
                        newNumberTwo = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("\nInvalid input! Please enter a valid integer.\n");
                        sc.nextLine();
                        break;
                    }
                    addNewContact(phonebook, newName, newNumberOne, newNumberTwo);
                    break;
                case 2:
                    showAllBook(phonebook); // show all
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("\nInvalid choice!\n");
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}
