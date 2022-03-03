package inheritance;

public class Teacher extends Person {
        //name,age of person class brought here for using extends person
        String address ;
        void displayInformation2(){
        //System.out.println("Name    : "+name);
        //System.out.println("Age     : "+age);
        super.displayInformation1();
        System.out.println("Address : "+address+"\n");
    }
}
