package variables;


public class Local_variables {


    public static void main(String[] args) {
        int num = 10;
        char ch = 'A';
        String str = "SB";

        Local_variables lv = new Local_variables();
        //     System.out.println("lv.getmyMethod() = " + lv.getmyMethod());//CTE
        lv.getmyMethod();
        System.out.println("lv.getmyMethodReturn() = " + lv.getmyMethodReturn());//20

    }

    public int getmyMethodReturn() {
        int localVariableInMethod = 20;
        return localVariableInMethod;
    }

    public void getmyMethod() {
        int localVariableInMethod = 200;
        System.out.println("localVariableInMethod = " + localVariableInMethod);//200
    }
}
