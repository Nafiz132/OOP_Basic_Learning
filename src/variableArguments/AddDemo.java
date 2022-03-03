package variableArguments;

public class AddDemo {

    void add(int num1, int num2) {
        System.out.println("The Result is : " + (num1 + num2));
    }

    void add(int n1, int n2, int num) {
        System.out.println("The Result is : " + (n1 + n2 + num));
    }

    //variabe length argument
    void add(int... num) {
        int sum = 0;
        for (int x : num) {
            sum += x;
        }
        System.out.println("The sum is : " + sum);
    }

}
