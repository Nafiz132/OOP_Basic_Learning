/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author User
 */
public class Test2 {
    public static void main(String[] args) {
        TeacherT teacher1,teacher2,teacher3,teacher4;
        teacher1 = new TeacherT();
        teacher1.name="Rezaul Islam";
        teacher1.gender="Male";
        teacher1.age=35;
        teacher1.phone=951565481;
        teacher1.displayInformation();
        
        teacher2 = new TeacherT();
        teacher2.name="Ishak Ahmed";
        teacher2.gender="Male";
        teacher2.age=40;
        teacher2.phone=791565481;
        teacher2.displayInformation();
        
        teacher3 = new TeacherT();
        teacher3.name="Abul Bashar";
        teacher3.gender="Male";
        teacher3.age=30;
        teacher3.phone=673565869;
        teacher3.displayInformation();
        
        teacher4 = new TeacherT();
        teacher4.name="Yasmin Begum";
        teacher4.gender="Female";
        teacher4.age=43;
        teacher4.phone=676765869;
        teacher4.displayInformation();
        
        TeacherT teacher5;
        teacher5 =new TeacherT();
        teacher5.setInformation("Golam Kibria", "Male", 31, 65256533);
        teacher5.displayInformation();
        
        TeacherT teacher6=new TeacherT();
        teacher6.setInformation("Azizul Haque Pathan", "Male", 48,452477655);
        teacher6.displayInformation();
        
    }
    
}
