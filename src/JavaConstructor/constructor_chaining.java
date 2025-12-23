package JavaConstructor;

class Student {
    int id;
    String name;
    int age;
    long no;

    // No-argument constructor
    public Student() {
        System.out.println("This is no argument constructor");
    }

    Student(int id) {
        this();
        this.id = id;
    }

    Student(int id, String name) {
        this(id);
        this.name = name;
    }

    Student(int id, String name, int age) {
        this(id, name);
        this.age = age;
    }

    Student(int id, String name, int age, long no) {
        this(id, name, age);
        this.no = no;
    }

    void display() {
        System.out.println(name + " " + age + " " + id + " " + no);
    }
}

public class constructor_chaining {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Mukesh", 23, 9908389080L);
        s1.display();
    }
}
