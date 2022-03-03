
package oop;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1,teacher2,teacher3;
        teacher1 = new Teacher();
        //Teacher teacher1=new Teacher();
        teacher1.name="Rezaul Islam";
        teacher1.gender="Male";
        teacher1.age=35;
        teacher1.phone=951565481;
        
        System.out.println("Name   : "+teacher1.name);
        System.out.println("Gender : "+teacher1.gender);
        System.out.println("Age    : "+teacher1.age);
        System.out.println("Phone  : "+teacher1.phone);
        System.out.println("\n");
        teacher2 = new Teacher();
        teacher2.name="Ishak Ahmed";
        teacher2.gender="Male";
        teacher2.age=40;
        teacher2.phone=791565481;
        
        System.out.println("Name   : "+teacher2.name);
        System.out.println("Gender : "+teacher2.gender);
        System.out.println("Age    : "+teacher2.age);
        System.out.println("Phone  : "+teacher2.phone);
        System.out.println("\n");
        teacher3 = new Teacher();
        teacher3.name="Abul Bashar";
        teacher3.gender="Male";
        teacher3.age=30;
        teacher3.phone=673565869;
        
        System.out.println("Name   : "+teacher3.name);
        System.out.println("Gender : "+teacher3.gender);
        System.out.println("Age    : "+teacher3.age);
        System.out.println("Phone  : "+teacher3.phone);
    }
    
}
   