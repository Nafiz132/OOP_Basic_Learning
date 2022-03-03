package problemSolving;

public class BitwiseCheck {

    public static void main(String[] args) {
        int x = 8;
        int y = ~x;
        int z = 6;
        System.out.println("Rational operator check : " + (x > z));
        System.out.println("Bitwise 02 : " + (x ^ z));
        System.out.println("The bitwise value for x = " + y);
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum is : " + sum);

        int j = 0;
        do {
            System.out.println("I’m stuck !");
            j++;
            if (j > 5) {
                break;
            }
        } while (true);
        System.out.println("\n");
        int twoD[][] = new int[3][3];
        int i1, j1, k = 0;
        for (i1 = 0; i1 < 3; i1++) {
            for (j1 = 0; j1 < 3; j1++) {
                twoD[i1][j1] = k;
                k++;
            }
        }
        for (i1 = 0; i1 < 3; i1++) {
            for (j1 = 0; j1 < 3; j1++) {
                System.out.print(twoD[i1][j1] + " ");
            }
            System.out.println();
        }
    }
}
