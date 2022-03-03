package superTesting;

public class CarTesting {

    public static void main(String[] args) {
        Car tesla = new Car("White", 350, 120);
        tesla.attribute();
        System.out.println("\n");
        Car bmw = new Car("Red", 280, 150);
        bmw.attribute();
    }

}
