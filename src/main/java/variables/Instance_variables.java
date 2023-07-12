package variables;

public class Instance_variables {

    int instanceVariableInClass=100;

    public static void main(String[] args) {
        int num=10;
        char ch='A';
        String str="SB";
        System.out.println("this is in static method local variable = " + num);//10

        System.out.println("********in main method********* ");
        Instance_variables iv=new Instance_variables();
        System.out.println("iv.instanceVariableInClassWithObject = " + iv.instanceVariableInClass);//100
        //or
        int assignInstanceVar=iv.instanceVariableInClass;
        System.out.println("assignInstanceVarWithObject = " + assignInstanceVar);//100

        int iv02=iv.instanceVariableInClass=98;
        System.out.println("iv02 = " + iv02);//98

        System.out.println("********object creation for non static void getAMethod********* ");
        Instance_variables ivforgetAmethod=new Instance_variables();
        ivforgetAmethod.getAMethod();
    }


    public void getAMethod(){
        System.out.println("********non static void getAMethod********* ");
        System.out.println("instanceVariableInClass = " + instanceVariableInClass);//100

        int iv02= instanceVariableInClass = 97;
        System.out.println("iv02 = " + iv02);

    }


}
