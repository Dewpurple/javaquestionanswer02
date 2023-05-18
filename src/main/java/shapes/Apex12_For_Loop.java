package shapes;

public class Apex12_For_Loop {
/*
Type code to draw the following image by using a for loop.
A A A A A A A A
A X X X X X X A
A X X X X X X A
A X X X X X X A
 */
    public static void main(String[] args) {

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <8 ; j++) {
                if(i>0 && j>=1 && j<7 ){
                    System.out.print("X ");
                }else{
                    System.out.print("A ");
                }
            }
            System.out.println();
        }
    }
}
