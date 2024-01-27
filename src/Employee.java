// Class representing an employee, inherits from the Person class
public class Employee extends Person {
    private String position;
    private double salary;

    // Method to get the position
    public String getPosition() {
        return position;
    }

    // Method to set the position
    public void setPosition(String position) {
        this.position = position;
    }

    // Constructor to create an employee with a given name and salary
    public Employee(String name, double salary) {
        super(name, "", salary); // Call the constructor of the base class Person
    }

    // Constructor to create an employee with a given name, surname, and salary
    public Employee(String name, String surname, double salary) {
        super(name, surname, salary); // Call the constructor of the base class Person

    }

    // Constructor to create an employee with a given name, surname, salary, and position
    public Employee(String name, String surname, double salary, String position) {
        super(name, surname, salary); // Call the constructor of the base class Person
        this.position = position;

    }

    // Override the toString method to output information about the employee
    @Override
    public String toString() {
        return "Employee:" + " " + getId() + ". " + getName() + " " + getSurname();
    }

    // Additional toString method with parameters that modifies the name and surname of the object
    public String toString(int id, String name, String surname) {
        this.setName(name);
        this.setSurname(surname);
        return "Employee: " + id + ". " + name  + " " + surname;
    }
}
