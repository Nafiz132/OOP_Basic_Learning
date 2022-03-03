
package thisKeyword;


public class Person {
    String name,address;
    int age,phone;
    //name,address,age are instance variable
    
    Person(String n,String a,int ag){
        //ag,a,n are local variable
        age=ag;
        name=n;
        address=a;
    }
    
    Person(String name,int age){
        this.name=name;
        this.age= age;
        
    }
    
    Person(String name,String address,int age,int phone){
        this(name,age);
        this.address=address;
        this.phone=phone;
    }
    void displayInformation(){
        System.out.println("\n"+"Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Age  : "+age);
        System.out.println("Phone : "+phone);
    }
    
}
