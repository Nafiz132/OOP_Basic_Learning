package abstraction;


public abstract class MobileUser {
    abstract void sendMessage();//abstract method
    
    void message(){
        System.out.println("This not an abstract method");
    }
}
