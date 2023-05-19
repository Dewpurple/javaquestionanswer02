package apexbook.loopquestions;

public class Q03 {

   /*
   Type code to check whether a String is palindrome or not. If a String is the same with its
    reverse then it is called palindrome. For example; “anna”, “123321” are palindromes
    */

    public static void main(String[] args) {
//    String s="anna";
//    String sReverse="";

//        for (int i = s.length()-1; i >=0; i--) {
//            String sSubstring=s.substring(i,i+1);
//            sReverse+=sSubstring;
//        }
//        if (s.equals(sReverse)) {
//            System.out.println("Palindrome");
//        }else{
//            System.out.println("Not palindrome");
//        }


        System.out.println();

//        String s="anna";
//        String sReverse="";
//
//        int j=s.length()-1;
//        while(j>=0){
//            String sSubstring=s.substring(j,j+1);
//            sReverse+=sSubstring;
//            j--;
//
//        }
//        if (s.equals(sReverse)) {
//            System.out.println("Palindrome");
//        }else{
//            System.out.println("Not Palindrome");
//        }

        System.out.println();

        String s="anna";
        String sReverse="";

        int k=s.length()-1;

        do{
            String sSubstring=s.substring(k,k+1);
            sReverse+=sSubstring;
            k--;


        }while (k>=0);

        if (s.equals(sReverse)) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }




    }