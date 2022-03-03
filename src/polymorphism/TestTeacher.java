package polymorphism;

public class TestTeacher {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display();
        Teacher t1 = new Teacher();
        t1.display();
        Student s1 = new Student();
        s1.display();
    }

}
