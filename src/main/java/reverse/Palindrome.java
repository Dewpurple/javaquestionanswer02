package reverse;

public class Palindrome {

    public static String isPalindrome(String s) {
        s=s.toLowerCase().replaceAll(" ","").replaceAll("\\p{Punct}","");
        String cont="";
        for (int i = s.length()-1; i >=0 ; i--) {
            cont+=s.charAt(i);

        }
        getPalindrome(cont,s);
        return (cont);
    }



    public static void getPalindrome(String cont,String s) {
        if(cont.equals(s)){
            System.out.println("This is palindrome");
        }else{
            System.out.println("This is not palindrome");
        }

    }

    public static void main(String[] args) {
        String s ="A man, a plan, a canal, Panama!";
        isPalindrome(s);


    }

}
