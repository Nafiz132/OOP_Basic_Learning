/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author User
 */
public class Teacher03Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        Person03 p =new Person03();
        Teacher03 t=new Teacher03();
        
        
        System.out.println(a instanceof Animal);
        System.out.println(p instanceof Animal);
        System.out.println(t instanceof Person03);
        System.out.println(t instanceof Animal);
        System.out.println(p instanceof Teacher03);
                
        
        
    }
    
}
