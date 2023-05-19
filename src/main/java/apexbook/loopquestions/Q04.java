package apexbook.loopquestions;

public class Q04 {

    public static void main(String[] args) {
        /*
        Type code to print the unique digits in an integer. Example; 223878 ⇒ 37
         */

//        int num=223878;
//        String sNum= String.valueOf(num);//223878

//        String cont="";
//        for (int i = 0; i < sNum.length(); i++) {
//            String sNumS=sNum.substring(i,i+1);
//            if(sNum.indexOf(sNumS)==sNum.lastIndexOf(sNumS)){
//                cont+=sNumS;
//            }
//        }
//        System.out.println("cont = " + cont);
//
//        int uniqueNum=Integer.valueOf(cont);
//        System.out.println( uniqueNum+1);



//        int num=223878;
//        String sNum= String.valueOf(num);//223878
//
//        String cont="";
//        int i=0;
//        while(i<sNum.length()){
//            String sNums=sNum.substring(i,i+1);
//            if(sNum.indexOf(sNums)==sNum.lastIndexOf(sNums)){
//                cont+=sNums;
//            }
//
//            i++;
//        }
//        System.out.println("cont = " + cont);


        int num=223878;
        String sNum= String.valueOf(num);//223878
        String cont="";
        int i=0;
        do{
           String sNumS=sNum.substring(i,i+1);
               if(sNum.indexOf(sNumS)==sNum.lastIndexOf(sNumS)){
                   cont+=sNumS;
               }
            i++;
        }while(i<sNum.length());

        System.out.println("cont = " + cont);
    }
}
