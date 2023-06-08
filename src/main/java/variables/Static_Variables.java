package variables;

import reverse.reverse;

public class Static_Variables {


    static int staticVariableInClass = 99;
    static int staticVariableInClass2 ;

    public static void main(String[] args) {
        int num = 10;
        char ch = 'A';
        String str = "SB";

        System.out.println("staticVariableInClass = " + staticVariableInClass);
        getStaticMethod();

        Static_Variables sb=new Static_Variables();
        sb.getStaticMethod2();
    }

    public static void getStaticMethod() {

        System.out.println("****** static method not main**********");
        System.out.println("staticVariableInClass from getStaticMethod = " + staticVariableInClass);//99

        int staticVariable01=staticVariableInClass=101;
        System.out.println("staticVariable01  " + staticVariable01);//101

        System.out.println("staticVariableInClass2 from getStaticMethod = " + staticVariableInClass2);//0
        int staticVariable02=staticVariableInClass2=1001;
        System.out.println("staticVariable02  " + staticVariable02);//1001

    }


    public void getStaticMethod2() {
        System.out.println("****** non static method *********");
        //if getStaticMethod() works and runs before getStaticMethod2(),
        // some of the variables will assign which is assigned in getStaticMethod()
        System.out.println("staticVariableInClass from getStaticMethod = " + staticVariableInClass);//99-101

        int staticVariable01=staticVariableInClass=102;
        System.out.println("staticVariable01  " + staticVariable01);//101-102

        System.out.println("staticVariableInClass2 from getStaticMethod = " + staticVariableInClass2);//1001
        int staticVariable02=staticVariableInClass2=1002;
        System.out.println("staticVariable02  " + staticVariable02);//1002


    }


}
