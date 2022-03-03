
package returning_value;

public class Test_Returning_value {
    public static void main(String[] args) {
        ReturningValue ob1 = new ReturningValue();
        int result = ob1.square(5);
        int answer ;//= ob1.square(6);
        
        System.out.println("The square of the value is : "+result+"\n");
        System.out.println("The square of the 2nd value is : "+ob1.square(6));
        System.out.println("The square of the value is : "+ob1.square(7));
    }
    
}
