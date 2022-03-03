
package oop;


public class TestConstructor {
    public static void main(String[] args) {
      
        Constructor teacher1;
        teacher1 = new Constructor("Foysal Aziz","Male",39,98783458);
        teacher1.displayInformation();
        
        Constructor teacher2;
        teacher2 = new Constructor("Rifat Parvin","Female",41,54673745);
        teacher2.displayInformation();
        
        Constructor teacher3;
        teacher3 = new Constructor("Sheikh Arif","Male",48,56432897);
        teacher3.displayInformation();
        
        //default constructor
        Constructor teacher4=new Constructor();
        //teacher4.displayInformation();
        
        Constructor teacher5= new Constructor("Jabead Iqbal","Male",31,8765564);
        teacher5.displayInformation();
        
        Constructor teacher6= new Constructor();
        teacher6.displayInformation();
    }
    
}
