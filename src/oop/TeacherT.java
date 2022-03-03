
package oop;

public class TeacherT {
    String name,gender,address;
    int age,phone;
    
    void setInformation(String n,String m,int ag,int ph)
    {
        name=n;
        gender=m;
        age=ag;
        phone=ph;
    }
    void displayInformation()
    {
        System.out.println("Name   : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Age    : "+age);
        System.out.println("Phone  : "+phone);
        System.out.println("\n");
    }
    
}
