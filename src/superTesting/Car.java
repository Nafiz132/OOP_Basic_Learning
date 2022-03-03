
package superTesting;

public class Car extends Vehicle {
    
    //color,weight,attribute already here due to extends inheritance;
    int gear;
    
    Car(String c, double w,int g){
        super(c,w);
        gear=g;
    }
    
    @Override
    void attribute(){
        super.attribute();
        System.out.println("Gear  : "+gear);
        
    }
    
}
