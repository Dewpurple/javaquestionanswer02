package apexbook.ifstatement;

public class Q08_StateAbreviations {

    /*
Type code to check the format of state abbreviations in the USA
a) Your code should print "State abbreviations cannot have more than 2 characters" if the
abbreviation has more than 2 characters
b) Your code should print "State abbreviations cannot have lowercase characters" if the
abbreviation has lowercase characters
c) Your code should print "State abbreviations cannot have characters different from
letters" if the abbreviation has characters different from letters.
     */

    public static void main(String[] args) {


        String abrv = "FL";
        int s= abrv.replaceAll("[^a-z]","").length();
        System.out.println(s);


        if (abrv.length()>2){
            System.out.println("State abbreviations cannot have more than 2 characters");
        }
        if(abrv.replaceAll("[^a-z]","").length()>0){
            System.out.println("State abbreviations cannot have lowercase characters");
        }
        if(abrv.replaceAll("[A-Za-z]","").length()>0){
            System.out.println("State abbreviations cannot have characters different from\n" +
                    "letters");

        }
        }

    }



