
package staticMethod;

public class StaticBlock {
    static int id;
    static String name;
    
    static{
        id= 1001;
        name="Saif Ahnaf";
    }
    static void display(){
        System.out.println("ID is  : "+id);
        System.out.println("Name is: "+name);
    }
    public static void main(String[] args) {
        StaticBlock.display();
    }
}
