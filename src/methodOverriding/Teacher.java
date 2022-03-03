
package methodOverriding;

public class Teacher extends Person{
    String address;
    
    @Override
     void displayInformation(){
        System.out.println("Name   : "+name);
        System.out.println("Age    : "+age);
        System.out.println("Address: "+address+"\n");
    }
    
    
}
