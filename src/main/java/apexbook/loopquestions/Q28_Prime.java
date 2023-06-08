package apexbook.loopquestions;

public class Q28_Prime {
    public static void main(String[] args) {
    /*
    Type a code that prints all prime numbers less than a given number. Example: if user enters
    20 output will be 2, 3, 5, 7, 11, 13, 17, 19
    */

       getPrime(35);

        }

        public static boolean isPrime(int n) {
            if (n <= 0) {
                System.out.print("enter positive num");
                return false;
            }

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }

            }

            return true;
        }

    public static void getPrime(int n) {
        for (int i = 2; i <=n ; i++) {
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }

        }

}


