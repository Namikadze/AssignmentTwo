// Class representing a person, implementing Comparable and Payable interfaces
public class Person implements Comparable<Person>, Payable {
    private int id;
    private static int id_m = 1;
    private String name;
    private String surname;
    private double paymentAmount;

    // Default constructor, initializes the id and increments the id_m counter
    public Person() {
        id = id_m++;
    }

    // Method to get the id
    public int getId() {
        return id;
    }

    // Method to get the name
    public String getName() {
        return name;
    }

    // Method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the surname
    public String getSurname() {
        return surname;
    }

    // Method to set the surname
    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Method to get the payment amount
    public double getPaymentAmount() {
        return paymentAmount;
    }

    // Method to set the payment amount
    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    // Constructor to create a person with a given name and surname
    public Person(String name, String surname) {
        this(); // Calls the default constructor to initialize id
        setName(name);
        setSurname(surname);
    }

    // Constructor to create a person with a given name, surname, and payment amount
    public Person(String name, String surname, double paymentAmount) {
        this.name = name;
        this.surname = surname;
        this.paymentAmount = paymentAmount;
        this.id = id_m++;
    }

    // Implementation of the compareTo method from the Comparable interface
    // Compares objects based on their payment amounts
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.paymentAmount, other.paymentAmount);
    }

    // Override the toString method to represent the person as a string
    public String toString() {
        return id + ". " + name + " " + surname;
    }
}
