
package oop;

public class TestCallByValue {
    public static void main(String[] args) {
        CallByValue ob1 = new CallByValue();
        int x=10;
        System.out.println("Before calling : "+x);
        
        ob1.change(x);
        System.out.println("After calling : "+x);
        
        ob1.change(x);
        System.out.println("After 2nd Call: "+x);
    }
}
