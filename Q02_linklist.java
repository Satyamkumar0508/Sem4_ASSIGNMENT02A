import java.util.LinkedList;
import java.util.Scanner;

class Student {
    String name;
    int age;
    int mark;

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Mark: " + mark;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student student = (Student) obj;
        return name.equals(student.getName()) && age == student.getAge() && mark == student.getMark();
    }
}

public class Q02_linklist {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();

        // add students to the list
        studentList.add(new Student("John", 20, 90));
        studentList.add(new Student("Mary", 19, 85));
        studentList.add(new Student("Bob", 21, 75));

        // display the list
        System.out.println("List of students:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // ask user to enter a student object and print the existence of the object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student name: ");
        String name = scanner.next();
        System.out.print("Enter the student age: ");
        int age = scanner.nextInt();
        System.out.print("Enter the student mark: ");
        int mark = scanner.nextInt();
        Student student = new Student(name, age, mark);
        if (studentList.contains(student)) {
            System.out.println("Student " + student.getName() + " exists in the list.");
        } else {
            System.out.println("Student " + student.getName() + " does not exist in the list.");
        }
        // remove a specified student object
        System.out.print("Enter a student name to remove: ");
        String nameToRemove = scanner.next();
        for (Student s : studentList) {
            if (s.getName().equals(nameToRemove)) {
                studentList.remove(s);
                System.out.println("Student " + nameToRemove + " removed from the list.");
                break;
            }
        }
        // count the number of object present in the list
        System.out.println("Number of students in the list: " + studentList.size());

        scanner.close();
    }
}
