import java.sql.Time;

public class program {
    public static void main(String[] args) {

        Cat tupitsa = new Cat("Glupi", false, 3.75);

        System.out.println(tupitsa.getName());
        System.out.println(tupitsa.getWeight());

        tupitsa.setName("Piglya");
        tupitsa.ChangeWeight(4.10);
        tupitsa.MakeSterilized();
        tupitsa.MakeVaccinated();

        System.out.println(tupitsa.getName());
        System.out.println(tupitsa.getWeight());
    }
}
