import java.util.ArrayList;
import java.util.Collections;

// Main class representing the user application
public class Main {

    // Main method, the entry point of the application
    public static void main(String[] args) {
        // Create an ArrayList to store objects of type Person
        ArrayList<Person> people = new ArrayList<>();

        // Add instances of Employee and Student to the ArrayList
        people.add(new Employee("John Lennon", 27045.78));
        people.add(new Employee("George Harrison", 50000.00));
        people.add(new Student("Ringo Starr", 0.00, 2.5));
        people.add(new Student("Paul McCartney", 36660.00, 3.5));

        // Sort the ArrayList using the natural ordering (Comparable interface)
        Collections.sort(people);

        // Call the printData method to display information about each person
        printData(people);
    }

    // Method to print information about people
    public static void printData(Iterable<Person> people) {
        // Iterate over the collection of people and print their information
        for (Person person : people) {
            // Output the person's details and payment amount
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}
