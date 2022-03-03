
package boolBasic;

public class BoolTest {
    public static void main(String[] args) {
        boolean b,c;
        b=true;
        System.out.println("Here the value of b is : "+b);
        
        c= false;
        System.out.println("Here the value of c is : "+c);
        
        if(b){
            System.out.println("This line will be executed ");
        }
        if(c){
            System.out.println("This line won't be executed ");
        }
        System.out.println("10 > 9 ; this expression is "+(10>9));
    }
    
}
