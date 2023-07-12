package udemy.constructor;

public class Car {
    int price=50;

    public Car(int price){
        this.price=price;

    }

    public static void main(String[] args) {
        Car c1=new Car(50);
        System.out.println("c1.price = " + c1.price);

//        Car c2=new Car(); //CTE  because non existing constructor
//        System.out.println("c1.price = " + c1.price);

        Car c3=new Car(50);
        System.out.println("c1 = " + c1);//no CTE, on the console c1 = udemy.constructor.Car@3d075dc0



    }
}
