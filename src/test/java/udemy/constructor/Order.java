package udemy.constructor;

public class Order {
    String value="a";

    Order(){
        value=value+"b";

    }

    Order(String c){
        this.value="saf";
        value=value+c;

    }

    public static void main(String[] args) {
        Order order1 =new Order();
        System.out.println("order1.value = " + order1.value);//ab

        Order order2 =new Order("r");
        System.out.println("order2.value = " + order2.value);//ar
        System.out.println("order2+ order1 = " + (order2.value+ order1.value));//arab

        Order order3 =new Order("a");
        System.out.println("order3.value = " + order3.value);//safa


    }


}
