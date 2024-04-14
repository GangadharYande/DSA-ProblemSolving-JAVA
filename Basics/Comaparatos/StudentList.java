import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Define the Student class
class Student {
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
}

public class StudentList {

    public static void main(String args[]) {

        // Comparator to sort students by age
        Comparator<Student> byAge = new Comparator<Student>(){
            public int compare(Student i, Student j){
                // Compare ages of two students
                if(i.age > j.age) return 1; // If age of i is greater than age of j, return 1
                else return -1; // Otherwise, return -1
            }
        };

        // Create a list to store Student objects
        List<Student> studs = new ArrayList<>();
        
        // Add Student objects to the list
        studs.add(new Student(18, "Jansi"));
        studs.add(new Student(22, "Megha"));
        studs.add(new Student(19, "Anil"));
        studs.add(new Student(20, "Salman"));
        studs.add(new Student(21, "Ankush"));

        // Print the list of students before sorting
        for (Student s : studs) {
            System.out.println(s);
        }
        System.out.println();

        // Sort the list of students using the byAge comparator
        Collections.sort(studs, byAge);
        
        // Print the list of students after sorting
        for (Student s : studs) {
            System.out.println(s);
        }
    }
}
