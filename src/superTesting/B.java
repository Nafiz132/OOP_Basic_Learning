
package superTesting;

public class B extends A{
    //x=10; from superclass
    int n =5;
    
    void displayInformation(){
        System.out.println(n);
    }
    
    void displayInformatuon02(){
        System.out.println(super.n);
    }
}
