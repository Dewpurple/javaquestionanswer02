package udemy.constructor;

public class Order2 {
    int a;
    int b;

    Order2 (int a, int b){
        this.a=a;
        this.b=b;

    }

    Order2(){

    }

    public static void main(String[] args) {
        Order2 or=new Order2(3,5);
        System.out.println("or.a +or.b = " + or.a + or.b);//35

        or=new Order2();
        System.out.println("or.a +or.b = " + or.a + or.b);//00

        Order2 or2=or;
        System.out.println("or2.a = " + or2.a);//0


    }
}
