
package inheritance;

public class Teacher02Test {
    public static void main(String[] args) {
        Teacher02 t1=new Teacher02();
        t1.setName("Mazharul islam");
        t1.setAge(54);
        t1.setAddress("west Brahmondi");
        
        /*System.out.println("Name    : "+ t1.getName());
        System.out.println("Age     : "+t1.getAge());
        System.out.println("Address : "+t1.getAddress());*/
        
        t1.diplayInformation();
        
        Teacher02 t2=new Teacher02();
        t2.setName("Abdul Halim");
        t2.setAge(45);
        t2.setAddress("Itakhola");
        t2.diplayInformation();
        
        Teacher02 t3=new Teacher02();
        t3.setName("Nazim Uddin");
        t3.setAge(42);
        t3.setAddress("Kumradi");
        t3.diplayInformation();
    }
}
