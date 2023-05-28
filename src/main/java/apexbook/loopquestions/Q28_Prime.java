package apexbook.loopquestions;

public class Q28_Prime {
    public static void main(String[] args) {
    /*
    Type a code that prints all prime numbers less than a given number. Example: if user enters
    20 output will be 2, 3, 5, 7, 11, 13, 17, 19
    */

       getString(30);

        }



    public static void getString(int num1) {
        if (num1 <= 0) {
            System.out.println("enter positive num");
        }
        String s = "";
        int idx = 1;
        for (int i = 2; i < num1; i++) {

            if(i==2 || i==3){
                s+=i+ " ";

            }else if(i%1==0 && i%i==0 && i%2!=0 && i%3!=0){
                s+=i+ " ";
            }
//

        }
        System.out.println(s);
    }
}


