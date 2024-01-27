// Class representing a student, inherits from the Person class
public class Student extends Person {
    private double gpa;

    // Method to get the student's GPA
    public double getGpa() {
        return gpa;
    }

    // Method to set the student's GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Constructor to create a student with a given name, stipend, and GPA
    public Student(String name, String surname, double gpa) {
        // Call the constructor of the base class Person
        // If GPA is greater than 2.70, set stipend as the payment amount, otherwise set it to 0.0
        super(name, surname);
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if(gpa>2.67) {
            return 36600.0;
        } else {
            return 0.0;
        }
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
