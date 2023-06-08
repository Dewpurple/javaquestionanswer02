package apexbook.ifstatement;

public class Q07_NameRulles {

    public static void main(String[] args) {
        String fullName="Ali ";


        String initialOfFirstName = fullName.substring(0,1);
        int indexOfSpace = fullName.trim().indexOf(' ');

        String initialOfLastName = fullName.substring(indexOfSpace+1,indexOfSpace+2);
        Boolean isFirstNameInitialUpperCase = (initialOfFirstName.charAt(0)>='A' && initialOfFirstName.
                charAt(0)<='Z');
        Boolean isLastNameInitialUpperCase = (initialOfLastName.charAt(0)>='A' && initialOfLastName.
                charAt(0)<='Z');
        if(indexOfSpace==-1){
            System.out.println("First name or last name missed");
        }
        if(!isFirstNameInitialUpperCase || !isLastNameInitialUpperCase){
            System.out.println("Error in initials");
        }
        if(fullName.equals(fullName.toUpperCase())){
            System.out.println("Format error");
        }
        if(fullName.replaceAll("\\s","").length()==0){
            System.out.println("Name was not entered");
        }
        if(fullName.replaceAll("\\s","").replaceAll("[A-Za-z]","").length()>0){
            System.out.println("Invalid Name");
        }

    }
}
