
package overLoading_Constructor;


public class Teacher {
        String name,gender;
        int phone,age;
        
        //default constructor
        Teacher(){
            System.out.println("No Information \n");
        }
        
        Teacher(String n,String g){
            name=n;
            gender=g;
        }
        
         Teacher(String n,String g,int a,int ph){
            name=n;
            gender=g;
            age=a;
            phone=ph;
        }
         void displayInformation(){
             System.out.println("name   : "+name);
             System.out.println("Gender : "+gender);
             System.out.println("Age    : "+age);
             System.out.println("Phone  : "+phone);
             System.out.println("\n");
         }
}
