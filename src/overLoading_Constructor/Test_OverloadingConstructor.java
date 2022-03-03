
package overLoading_Constructor;

public class Test_OverloadingConstructor {
        public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        
        Teacher teacher2 = new Teacher("Ahsan Habib","Male");
        teacher2.displayInformation();
        
        Teacher teacher3 = new Teacher("Nazmul Hassan","Male",43,8769054);
        teacher3.displayInformation();
        
        Teacher teacher4 = new Teacher("Abul Bashar","Male",28,2346433);
        teacher4.displayInformation();
        
        Teacher teacher5 = new Teacher("Mrs.Farzana","Female",34,65566765);
        teacher5.displayInformation();
    }
}
