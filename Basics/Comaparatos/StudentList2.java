import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Define the Student class implementing Comparable interface for natural ordering

class Student implements Comparable<Student> { 
    int age; // Age of the student
    String name; // Name of the student

    // Constructor to initialize age and name
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Override toString method to print student details
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    // Implement compareTo method to compare students based on age
    public int compareTo(Student that) {
        if (this.age > that.age)
            return 1; // Return 1 if this student's age is greater
        else if (this.age < that.age)
            return -1; // Return -1 if this student's age is less
        else
            return 0; // Return 0 if ages are equal
    }
}

public class StudentList2 {
    public static void main(String args[]) {
        List<Student> studs = new ArrayList<>(); // Create a list to store Student objects

        // Add Student objects to the list
        studs.add(new Student(18, "Jansi"));
        studs.add(new Student(22, "Megha"));
        studs.add(new Student(19, "Anil"));
        studs.add(new Student(20, "Salman"));
        studs.add(new Student(21, "Ankush"));

        // Print the list of students before sorting
        System.out.println("List of students before sorting:");
        for (Student s : studs) {
            System.out.println(s);
        }
        System.out.println();

        // Sort the list of students using a lambda expression to specify the comparator
        Collections.sort(studs, (s1, s2) -> s1.compareTo(s2));

        // Print the list of students after sorting
        System.out.println("List of students after sorting by age:");
        for (Student s : studs) {
            System.out.println(s);
        }
    }
}
