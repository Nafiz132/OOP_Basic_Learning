/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemSolving;

class NewEmployee implements Employee {

    String name = "";
    String phoneNo = "";

    @Override
    public void name(String name) {
        this.name = name;
    }

    @Override
    public void phoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    void printPersonInfo() {
        System.out.println(name + phoneNo);
    }

    public static void main(String[] args) {
        NewEmployee p = new NewEmployee();
        p.name("Jacob");
        p.phoneNo("01765315");
        p.printPersonInfo();
    }
}
