class Person {
    String name;
    String id;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String grade;
    String department;

    public Student(String name) {
        super(name);
    }
}

public class UpcastingEx {

    public static void main(String[] args) {
        Person person;
        Student student = new Student("이재문");
        person = student;

        System.out.println(person.name);// no error

        // person.grade = "A"; // compile error
        // person.department = "com"; // compile error
    }
}