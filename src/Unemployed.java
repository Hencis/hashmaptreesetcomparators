public class Unemployed extends Person {

    private String nationality;

    public Unemployed(String personsName, Integer personsAge, String nationality) {
        super(personsName, personsAge);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Unemployed{" + "Name:" + getName() + "\" +" + "Age: " + getAge() + "\" +" + "Nationality=" + nationality + '\'' + '}';
    }
}
