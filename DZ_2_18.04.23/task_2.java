// Дана строка (получение через обычный текстовый файл!!!)
// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"
//
// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].
//
// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task_2 {
    public static void main(String[] args) {
        String fileName = "students.txt";
        String line;
        StringBuilder sb = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                String surname = tokens[0].split(":")[1].replaceAll("\"", "");
                String grade = tokens[1].split(":")[1].replaceAll("\"", "");
                String subject = tokens[2].split(":")[1].replaceAll("\"", "");

                sb.append("Студент ")
                        .append(surname)
                        .append(" получил ")
                        .append(grade)
                        .append(" по предмету ")
                        .append(subject)
                        .append(".\n");
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла.");
            e.printStackTrace();
        }
    }
}


