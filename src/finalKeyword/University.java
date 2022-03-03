
package finalKeyword;


public class University {
    final String name="SUST";
    final int student=5000;
    final int fees;//blank variable
    static final int age ;
    University(){
        fees=10000;
    }
    static{
        age= 29;
    }
    
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Student : "+student);
        System.out.println("Fees : "+ fees);
        System.out.println("Age : "+age);
    }
    
}
