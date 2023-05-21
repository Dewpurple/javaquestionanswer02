package apexbook.loopquestions;

public class Q16 {

    /*
    Type all characters before the first occurrence of 'm' in a String
     */

    public static void main(String[] args) {
        String s = "Christmas";
        int idx=s.indexOf('m');

//        for (int i = 0; i <idx ; i++) {
//            String str=s.substring(i,i+1);
//            System.out.print(str + " ");
//
//
//        }

        int i=0;
//        while(i<idx){
//            String str=s.substring(i,i+1);
//            System.out.print( str);
//            i++;
//        }



        do{
            String str=s.substring(i,i+1);
            System.out.print( str);
            i++;
        }while(i<idx);

    }
}
