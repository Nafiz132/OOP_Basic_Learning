package static_keyword;

public class Student {

    String name;
    int roll;
    static String uni_name = "SUST";

    Student(String n, int r) {
        name = n;
        roll = r;
    }

    void displayInformation() {
        System.out.println("Name            : " + name);
        System.out.println("Roll            : " + roll);
        System.out.println("University Name : " + uni_name);
        System.out.println("\n");
    }

}
