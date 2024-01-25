public class Person {
    private int id;
    private static int id_m;
    private String name;
    private String surname;

    public Person() {
        id = id_m++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    public String toString() {
        return id + " " + name + " " + surname;
    }
}
