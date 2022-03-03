
package encapsulation;

public class Person {
    
    private String name;
    private int age;
    
    public void setName(String nme){
        this.name=nme;
    }
    public String getName()
    {
        //System.out.println("Nafiz");
        return name;
    }
    
    public void setAge(int ag){
        this.age=ag;
    }
    
    public int getAge(){
       // System.out.println(21);
        return age;
    }
   /* void displayInformation()
    {
        System.out.println("Name : "+name);
        System.out.println("Age  : "+age);
    }*/
    
}
