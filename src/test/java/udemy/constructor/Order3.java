package udemy.constructor;

public class Order3 {
    int a;
    String b="Good";

    Order3(int a, String b){
        this.a=a;
        this.b=b;
        System.out.println("Constructor1");
    }


    Order3(String b, int a){
        System.out.println("Constructor2");
    }

    Order3(){
        System.out.println("Constructor3");
    }


    public static void main(String[] args) {
        Order3 or=new Order3("R",5);
        System.out.println("or.a +or.b = " + or.a + or.b);//Constructor2
                                                         // 0Good

        or=new Order3();
        System.out.println("or.a +or.b = " + or.a + or.b);//Constructor3
                                                         // 0Good

        Order3 or2=or;
        System.out.println("or2.a = " + or2.a);//0

        Order3 or3=new Order3(5,"M");
        System.out.println("or3.a +or3.b = " + or3.a + or3.b);//5M

        Order3 or4=or3;
        System.out.println("or2.a = " + or4.a);//5

    }
}
