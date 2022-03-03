
package problemSolving;


public class Rectangle extends Shape {
    Rectangle(double num1,double num2){
        /*num1=lenght;
        num2=width;*/
        super(num1,num2); 
    }
    void area(){
        double result = num1 *num2;
        System.out.println("The area of Rectangle is : "+result);
    }
}
