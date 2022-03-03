
package modifier;

public class A {
    //if private void display(); access denied;
    public void display(){
        
        System.out.println("Hi! I am from public method ");
    }
    
    protected void displayInformation(){
        System.out.println("Hello! I am from protected method");
    }
}
