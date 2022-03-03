
package methodOverloading;


public class Overload {
    void add(int a,int b){
        System.out.println("The sum is : "+(a+b)+"\n");
    }
    
    void add(double a,double b){
        System.out.println("The sum is : "+(a+b)+"\n");
    }
    
    void add(int a,int b,int c){
        System.out.println("The sum is : "+(a+b+c)+"\n");
    }
    
    void add(){
        System.out.println("Nothing to add\n");
    }
    
}
