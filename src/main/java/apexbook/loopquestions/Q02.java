package apexbook.loopquestions;

public class Q02 {
/*
Type code to print repeated characters in a String. For example; accessories ⇒ ces
 */
    public static void main(String[] args) {
//        String s="accessories";
//
//        String cont="";
//        for (int i = 0; i <s.length() ; i++) {
//
//            String s1=s.substring(i,i+1);
//
//            if(s.indexOf(s1)!=s.lastIndexOf(s1) ){
//                if(!cont.contains(s1)){
//                    cont+=s1;
//                }
//            }
//        }
//        System.out.println("cont = " + cont);

        System.out.println();

        String s="accessories";
        String cont="";

        int j=0;
        while(j<s.length()){
            String s1= s.substring(j,j+1);
            if(s.indexOf(s1)!=s.lastIndexOf(s1)){
                if (!cont.contains(s1)) {

                    cont+=s1;
                }
            }
            j++;
        }
        System.out.println("cont = " + cont);
    }
}
