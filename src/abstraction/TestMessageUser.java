
package abstraction;


public class TestMessageUser {
    public static void main(String[] args) {
        MobileUser mu;
        mu=new Nasrin();
        mu.sendMessage();
        //mu.message();
        mu= new Rifat();
        mu.sendMessage();
        //mu.message();
    }
}
