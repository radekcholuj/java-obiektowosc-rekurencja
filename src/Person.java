public class Person {
    private String name;
    private String surname;
    private Person[] persons;

    public Person(String name, String surname, Person[] persons) {
        this.name = name;
        this.surname = surname;
        this.persons = persons;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person[] getPersons() {
        return persons;
    }
}
