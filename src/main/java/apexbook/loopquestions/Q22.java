package apexbook.loopquestions;

public class Q22 {

    public static void main(String[] args) {
        /*
        Type code to print integers from 3 to 9 except 5
         */


        for (int i = 3; i <10 ; i++) {
              if(i==5){
                continue;
            }

            System.out.println(i);
        }

    }
}
