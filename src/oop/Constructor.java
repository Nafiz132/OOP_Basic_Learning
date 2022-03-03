package oop;

public class Constructor {

    String name, gender;
    int age, phone;
//constructor name is same as class name;parameterized 

    Constructor(String n, String g, int ag, int ph) {
        name = n;
        gender = g;
        age = ag;
        phone = ph;
    }

    Constructor() {
        System.out.println("No Value \n");
    }

    void displayInformation() {

        System.out.println("Name   : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Age    : " + age);
        System.out.println("Phone  : " + phone);
        System.out.println("\n");
    }
}
