
package inheritance;


public class TeacherTest {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.name="Forhad Manzur";
        t1.age=45;
        t1.address="Dhaka";
        t1.displayInformation2();
        
        Teacher t2=new Teacher();
        t2.name="Kalam Azad";
        t2.age=40;
        t2.address="Rajshahi";
        t2.displayInformation2();
    }
    
}
