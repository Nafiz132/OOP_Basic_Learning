
package problemSolving;

public class Triangle extends Shape {
    //num1,num2
    Triangle(double num1,double num2){
        /*num1=base;
        num2=height;*/
        super(num1,num2);
        
        
    }
    void area(){
        double result =0.5*num1*num2;
        System.out.println("The area of triangle is : "+result);
    }
    
}
