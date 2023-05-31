public class Cat {
    private int id;
    private String name;
    private long birthDate;
    private boolean sexMale;
    private String breed;
    private double weight;
    private boolean vaccinated = false;
    private boolean sterilized = false;

    public Cat(String name, Boolean sexMale, double weight){
        this.name = name;
        this.sexMale = sexMale;
        this.weight = weight;
    }
    public Cat(String name, Boolean sexMale, double weight, long birthDate, String breed, boolean vaccinated, boolean sterilized){
        this.name = name;
        this.sexMale = sexMale;
        this.weight = weight;
        this.birthDate = birthDate;
        this.breed = breed;
        this.vaccinated = vaccinated;
        this.sterilized = sterilized;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }

    public void ChangeWeight(double weight) {
        this.weight = weight;
    }

    public void MakeVaccinated() {
        this.vaccinated = true;
    }

    public void MakeSterilized() {
        this.sterilized = true;
    }


}
