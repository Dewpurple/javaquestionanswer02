package apexbook.loopquestions;

public class Q27 {

    /*
From a given array find all pairs whose sum is a given number.
If the array is {4, 6, 5, -10, 8, 5, 20} and the number is 10 then output will be
4+6=10, 5+5=10, -10+20=10
     */
    public static void main(String[] args) {
        int[] arr = {4, 6, 5, -10, 8, 5, 20};
        int num = 10;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    System.out.println(arr[i] + "+" + arr[j] + "= 10");
                }
            }


        }

//        int idx = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] + arr[idx] == num) {
//                System.out.println(arr[i] + "+" + arr[idx] + "= 10");
//            }


        }


    }


