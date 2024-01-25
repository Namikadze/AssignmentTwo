// Class representing a student, inherits from the Person class
public class Student extends Person{
    private static int id_gen = 1;
    private String name;
    private String surname;
    private int id;
    private double gpa;

    // Method to get the student's id
    public int getId() {
        return id;
    }

    // Method to get the student's name
    public String getName() {
        return name;
    }

    // Method to set the student's name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the student's surname
    public String getSurname() {
        return surname;
    }

    // Method to set the student's surname
    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Method to get the student's GPA
    public double getGpa() {
        return gpa;
    }

    // Method to set the student's GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Constructor to create a student with a given name, stipend, and GPA
    public Student(String name, double stipend, double gpa) {
        // Call the constructor of the base class Person
        // If GPA is greater than 2.70, set stipend as the payment amount, otherwise set it to 0.0
        super(name, "", gpa > 2.70 ? stipend : 0.0);
        this.gpa = gpa;
        this.id = id_gen++;
    }

    // Override the toString method to display information about the student
    @Override
    public String toString() {
        return "Student: " + super.toString() + ", " + "GPA: " + gpa + ",";
    }

    // Additional toString method with parameters, which modifies the name and surname of the object
    public String toString(int id, String name, String surname) {
        this.setName(name);
        this.setSurname(surname);
        return "Student: " + id + ". " + name  + " " + surname;
    }
}
