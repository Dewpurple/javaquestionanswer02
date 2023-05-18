package shapes;

public class Diamond02 {

    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int j = i; j <9-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i+i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <5 ; i++) {
            for (int j = 0; j <=i+i ; j++) {
                System.out.print(" ");
            }
            for (int k = i+i; k <9 ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
