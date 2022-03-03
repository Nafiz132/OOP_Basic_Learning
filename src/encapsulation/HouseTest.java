
package encapsulation;

public class HouseTest {
    public static void main(String[] args) {
        House f1=new House();
        f1.setName("Water Lilly");
        f1.setColor("White");
        f1.setNum(175);
        f1.setTrophy(5);
        
        System.out.println("Name of the House        : "+f1.getName());
        System.out.println("Color Symbol of the House: "+f1.getColor());
        System.out.println("Total number of students : "+f1.getNum());
        System.out.println("Total achieved trophy    : "+f1.getTrophy());
        
        House f2=new House();
        f2.setName("Rose");
        f2.setColor("Red");
        f2.setNum(188);
        f2.setTrophy(6);
        
        System.out.println("\n"+"Name of the House   : "+f2.getName());
        System.out.println("Color Symbol of the House: "+f2.getColor());
        System.out.println("Total number of students : "+f2.getNum());
        System.out.println("Total achieved trophy    : "+f2.getTrophy());
        
        House f3=new House();
        f3.setName("Polash");
        f3.setColor("White");
        f3.setNum(140);
        f3.setTrophy(3);
        
        System.out.println("\n"+"Name of the House   : "+f3.getName());
        System.out.println("Color Symbol of the House: "+f3.getColor());
        System.out.println("Total number of students : "+f3.getNum());
        System.out.println("Total achieved trophy    : "+f3.getTrophy());
    }
    
}
