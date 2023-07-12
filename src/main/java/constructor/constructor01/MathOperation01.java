package constructor.constructor01;

public class MathOperation01 {

    int a;
    int b=11;
    int c;
    int d;
    int f;
    String s="Purple";

    public MathOperation01(String str){

    }
    public MathOperation01() {

        a=90;
        f=500;
    }

    public MathOperation01(int b) {
        this.c=b;
        this.b=100;
        f=1000;


    }

    public MathOperation01(int c, int d) {
        System.out.println("******this.c=c***two parameter constructor********");
        System.out.println( this.c = c);
        System.out.println("******this.d=d***two parameter constructor********");
        System.out.println(this.d = d);
    }
    public MathOperation01(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int multiplication(){
        return c*d;
    }

    public int add(){
        return c+d;
    }

    public int add2(){
        return b+2;
    }

    public int subtraction00(){
        return a-2;
    }

    public int subtraction01(){
        return c-9;
    }

    public int subtraction2(int b){
        return b-2;
    }

    public int subtraction3(int f){
        return f-2;
    }

    public int subtraction4(int c){
        return c-2;
    }

    public int subtraction5(int c,int a, int f){
        return a-c-f;
    }

    public int division(){
        return b/2;
    }

    public int add1000(){
        return f+1000;
    }

    public String introduction(String a){
        return "Hello " +a;
    }

    public String endOfConversation(){

        return "Bye " +(b)+" "+(s);
    }

    public static void main(String[] args) {

        System.out.println("*******no parameter constructor**********");
        MathOperation01 m2=new MathOperation01();
        System.out.println("subtraction no parameter==>" +m2.subtraction00());
        System.out.println("m2.a = " + m2.a);
        System.out.println("m2.b = " + m2.b);
        System.out.println("m2.c = " + m2.c);
        System.out.println("m2.d = " + m2.d);
        System.out.println("m2.f = " + m2.f);
        System.out.println("m2.s = " + m2.s);

        System.out.println("*******no parameter constructor**********");
        MathOperation01 m3=new MathOperation01();
        System.out.println("m3 division no parameter==>" +m3.division());
        System.out.println("m3.a = " + m3.a);
        System.out.println("m3.b = " + m3.b);
        System.out.println("m3.c = " + m3.c);
        System.out.println("m3.d = " + m3.d);
        System.out.println("m3.f = " + m3.f);
        System.out.println("m3.s = " + m3.s);

        System.out.println("*******no parameter constructor**********");
        MathOperation01 m33=new MathOperation01();
        System.out.println("m33.add1000() = " + m33.add1000());



        System.out.println("*******one int parameter constructor**********");
        MathOperation01 m4=new MathOperation01(20);
        System.out.println("division With 20 one parameter==>" +m4.division());
        System.out.println("m4.add() = " + m4.add());
        System.out.println("m4.add2() = " + m4.add2());
        System.out.println("m4.subtraction00() = " + m4.subtraction00());
        System.out.println("m4.subtraction01() = " + m4.subtraction01());
        System.out.println("m4.subtraction2() = " + m4.subtraction2(200));
        System.out.println("m4.subtraction3() = " + m4.subtraction3(8));
        System.out.println("m4.subtraction4() = " + m4.subtraction4(80));
        System.out.println("m4.subtraction5(1,2,3) = " + m4.subtraction5(11, 22, 3));
        System.out.println("m4.add1000() = " + m4.add1000());
        System.out.println("m4.a = " + m4.a);
        System.out.println("m4.b = " + m4.b);
        System.out.println("m4.c = " + m4.c);
        System.out.println("m4.d = " + m4.d);
        System.out.println("m4.f = " + m4.f);
        System.out.println("m4.s = " + m4.s);

        System.out.println("m2.a = " + m2.a);
        System.out.println("m2.b = " + m2.b);
        System.out.println("m2.c = " + m2.c);

        System.out.println("*******2 parameter constructor**********");
        MathOperation01 m1=new MathOperation01(2,3);
        System.out.println("multiplication 2 parameter==> "+m1.multiplication());
        System.out.println("m1.a = " + m1.a);
        System.out.println("m1.b = " + m1.b);
        System.out.println("m1.c = " + m1.c);
        System.out.println("m1.d = " + m1.d);
        System.out.println("m1.f = " + m1.f);
        System.out.println("m1.s = " + m1.s);

        System.out.println("*******2 parameter constructor*******");
        System.out.println("m1.add()" +m1.add());
        System.out.println("m1.division()" +m1.division());
        System.out.println("m1.add() " + m1.add());
        System.out.println("m1.subtraction()" + m1.subtraction00());
        System.out.println("m1.add1000() " + m1.add1000());


        System.out.println("*******String name **********");
        MathOperation01 m5=new MathOperation01("Deep Blue");
        System.out.println("String name with parameter==> "+m5.s);
        System.out.println("m5.introduction() = " + m5.introduction("White"));
        System.out.println("m5.endOfConversation = " + m5.endOfConversation());

    }
}
