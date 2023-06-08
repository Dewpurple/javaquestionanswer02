package apexbook.loopquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q30_Reverse_Words {


    public static void main(String[] args) {

//        reverse1();
//        reverse2();
//        reverse3();
          reverse4();



        }



    public static void reverse4() {
        String str = "Kemal Can Kuzu";
        String[] sArr = str.split(" ");

        List<String> listString = new ArrayList<>();
        for (int i = sArr.length - 1; i >= 0; i--) {
            listString.add(sArr[i]);


        }

        System.out.println(listString);//[Kuzu, Can, Kemal]
    }

    public static void reverse3() {
        String str = "Kemal Can Kuzu";
        String[] sArr = str.split(" ");
        String reverse = "";


        for (int i = sArr.length - 1; i >= 0; i--) {
            reverse += sArr[i] + " ";

        }

        System.out.println(reverse);
    }


    public static void reverse2() {
        String str = "Kemal Can Kuzu";
        String[] sArr = str.split(" ");
        int len = sArr.length;
        String[] newArr = new String[len];
        int idx = 0;
        for (int i = sArr.length - 1; i >= 0; i--) {
            newArr[idx] += sArr[i];
            idx++;

        }

        System.out.println(Arrays.toString(newArr));//[nullKuzu, nullCan, nullKemal]
    }


    public static void reverse1() {
        String str = "Kemal Can Kuzu";
        String[] sArr = str.split(" ");

        for (int i = sArr.length - 1; i >= 0; i--) {
            System.out.print(sArr[i] + " ");//Kuzu Can Kemal

        }
    }


}
