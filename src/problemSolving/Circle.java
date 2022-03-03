
package problemSolving;


public class Circle extends Shape {
    Circle(double r){
        /*num1=lenght;
        num2=width;*/
        super(r,r); 
    }
    void area(){
        double result = Math.PI *num1*num2;
        System.out.println("The area of Circle is : "+result);
    }
    
    
}
