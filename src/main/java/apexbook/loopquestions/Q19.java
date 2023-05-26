package apexbook.loopquestions;

public class Q19 {

    public static void main(String[] args) {
        /*
        Find the total number of characters different from space and punctuation marks in a String
         */
        String s = "Java is a strongly typed, object-oriented programming language.";
        s=s.replaceAll("\\s","").replaceAll("\\p{Punct}","");
        System.out.println(s.length());
    }
}
