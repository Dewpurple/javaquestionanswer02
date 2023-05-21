package apexbook.loopquestions;

public class Q09 {
/*
    Type code to print all lowercase characters in a String with an asterix.
            For example; 'Ali Can?' ==> l*i*a*n*

 */

    public static void main(String[] args) {
        String name="Ali Can?";
        name=name.replaceAll("[^a-z]","");


        for (int i = 0; i <name.length() ; i++) {
            String sName2=name.substring(i,i+1);
            System.out.print(sName2+ "*");
        }

//        int i=0;
//        while(i<name.length()){
//
//            String sName2=name.substring(i,i+1);
//            i++;
//            System.out.print( sName2 + "*");
//
//        }
//
//        int i=0;
//        do{
//
//            String sName2=name.substring(i,i+1);
//            System.out.println(sName2+ "*");
//            i++;
//
//        }while(i<name.length()-1);



    }
}
