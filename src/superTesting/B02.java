/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superTesting;

/**
 *
 * @author User
 */
public class B02 extends A02 {
    @Override
    void displayInformation(){
        super.displayInformation();
        System.out.println("Inside B");
        message();
    }
    
}
