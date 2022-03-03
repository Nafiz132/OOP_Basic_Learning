
package polymorphism;


public class TestForShapes {
    public static void main(String[] args) {
        /*
        Shape s1=new Shape();
        Rectangle r1=new Rectangle(10,34);
        Triangle t1= new Triangle(8,4);
         System.out.println(s1.area());
         System.out.println(r1.area());
         System.out.println(t1.area());
        */
        
        
        /*
          Shape s1=new Shape();
          Shape s2=new Rectangle(10,34);
          Shape s3=new Triangle(8,4);
        
         System.out.println(s1.area());
         System.out.println(s2.area());
         System.out.println(s3.area());
        */
        
        
        Shape[] s= new Shape[3];
        s[0]=new Shape();
        s[1]=new Rectangle(10,34);
        s[2]=new Triangle(8,4);
        
        for(int i=0;i<3;i++){
            System.out.println(s[i].area());
        }
       
    } 
}
