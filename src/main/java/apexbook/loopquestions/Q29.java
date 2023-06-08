package apexbook.loopquestions;

public class Q29 {

    /*
    Type a program to print the integers from 1 to 100 without using any loop.
     */
    public static void main(String[] args) {
        getNumbers(100);
    }

    public static void getNumbers(int n){
        if(n>0){
            getNumbers(n-1);
            System.out.print(n+ " ");
        }

    }
}
