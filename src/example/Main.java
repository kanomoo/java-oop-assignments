package example;

/**
 * Small runnable demo showing basic OOP: Person and Student.
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Person("Alice", 30);
        Person s = new Student("Bob", 20, "CS101");

        p.introduce();
        s.introduce();

        // Polymorphism example
        if (s instanceof Student) {
            Student st = (Student) s;
            System.out.println("Student ID: " + st.getStudentId());
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", age " + age + ".");
    }
}

class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm student " + studentId + ".");
    }

    public String getStudentId() { return studentId; }
}
