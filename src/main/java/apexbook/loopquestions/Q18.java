package apexbook.loopquestions;

public class Q18 {

    public static void main(String[] args) {
        String s = "Hello";

//        for (int i = 0; i < s.length(); i++) {
//            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
//                System.out.print(s.charAt(i));
//            }
//        }

//        int i = 0;
//        while (i < s.length()) {
//            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
//                System.out.print((s.charAt(i)));
//            }
//
//            i++;
//        }

        int i=0;
        do{
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                System.out.println(s.charAt(i));
            }
            i++;
        }while(i<s.length());


    }
}
