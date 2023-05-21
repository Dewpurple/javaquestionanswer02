package apexbook.loopquestions;

public class Q10 {

    /*
    Type code to print digits just in the decimal part of the given decimal number with an
asterix. For example; 75.4238 ==> *4*2*3*8
     */

    public static void main(String[] args) {


     double price = 75.4238;
     String priceStr=String.valueOf(price);
     int idx=priceStr.indexOf(".")+1;

//        for (int i = idx; i <priceStr.length() ; i++) {
//             String priceStr2=priceStr.substring(i,i+1);
//            System.out.print("*" + priceStr2);
//        }

//        int i=idx;
//        while(i<priceStr.length()){
//            String priceStr2=priceStr.substring(i,i+1);
//            System.out.print("*" + priceStr2);
//            i++;
//        }

        int i=idx;
        do{
            String priceStr2=priceStr.substring(i,i+1);
            System.out.print("*" + priceStr2);
            i++;
        }while(i<priceStr.length());



    }
}
