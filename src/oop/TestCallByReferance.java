
package oop;

public class TestCallByReferance {
    public static void main(String[] args) {
        CallByReferance ob1 = new CallByReferance();
        ob1.name="Nazmul";
        System.out.println("Before Calling Name is : "+ob1.name);
        
        ob1.change(ob1);
        System.out.println("After Calling Name is : "+ob1.name);
    }
    
}
