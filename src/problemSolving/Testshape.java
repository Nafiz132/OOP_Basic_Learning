
package problemSolving;


public class Testshape {
    public static void main(String[] args) {
        Shape ob1;
        ob1 = new Rectangle(10,15);
        ob1.area();
        
        ob1 = new Triangle(10,30);
        ob1.area();
        
        ob1 = new Circle(10);
        ob1.area();
    }
    
}
