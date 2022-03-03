
package staticVariable;


public class TestStaticVariable {
    public static void main(String[] args) {
        StaticVariable ob1= new StaticVariable();
        System.out.println("University Name is : "+ob1.UniversityName);
        System.out.println("My batch No. : "+StaticVariable.mybatch);
        System.out.println("Location of the Institute : "+StaticVariable.Location);  //no needed to create object for static variable
        
    }
    
}
