
package inheritance;


public class Teacher02 extends Person02 {
    private String address;
    //name and age variables are from Person02 class inheritance

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    void diplayInformation(){
        System.out.println("Name    : "+ getName());
        System.out.println("Age     : "+getAge());
        System.out.println("Address : "+getAddress()+"\n");
    }    
  
    
}
