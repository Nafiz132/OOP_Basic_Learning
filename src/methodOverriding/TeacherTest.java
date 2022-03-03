
package methodOverriding;


public class TeacherTest {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.name="Rashidul Alom Rifat";
        t1.age=19;
        t1.address="Ghoradia";
        t1.displayInformation();
        
        Teacher t2=new Teacher();
        t2.name="Nasimul Alom Rafin";
        t2.age=16;
        t2.address="Ghoradia";
        t2.displayInformation();
        
        Person p1=new Person();
        p1.name="Saimum Sadi";
        p1.age=43;
        p1.displayInformation();
    }
    
}
