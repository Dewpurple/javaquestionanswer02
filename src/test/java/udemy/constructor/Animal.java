package udemy.constructor;

public class Animal {
    int age = 7;
    String name = "Dog";
    boolean mammal;

    public Animal() {
        this(false);
        System.out.println("Constructor without parameter : ");
    }

    public Animal(int age) {
       this();
        System.out.println("Constructor has only one int parameter : ");
    }

    public Animal(boolean mammal) {
        this(true,0);
        System.out.println("Constructor has only one boolean parameter : ");
    }

    public Animal(boolean mammal, int age) {
        this.mammal = mammal;
        this.age = age;
        System.out.println("Constructor has 2 parameters mammal and age= : ");
    }

    public Animal(int age, String name, boolean mammal) {
        this.age = age;
        this.name = name;
        this.mammal = mammal;

        System.out.println("Constructor has 3 parameters int age, String name, boolean mammal: ");
    }


    public Animal(int age, String name) {
        this.age = 19;
        this.name = "Tamara";
        System.out.println("Constructor has 2 parameters int age, String name: " );

    }

    public static void main(String[] args) {


        Animal a1 = new Animal(true);
        System.out.println("a1.age = " + a1.age+ ":a1.name: " +a1.name+ ":a1.mammal: " +a1.mammal);
        System.out.println();

        Animal a2 = new Animal(true, 1);
        System.out.println("a2.age = " + a2.age+ ":a2.name: " +a2.name+ ":a2.mammal: " +a2.mammal);
        System.out.println();

        Animal a3 = new Animal(false, 3);
        System.out.println("a3.age = " + a3.age+ ":a3.name: " +a3.name+ ":a3.mammal: " +a3.mammal);
        System.out.println();

        Animal a4 = new Animal(41, "What the name is", true);
        System.out.println("a4.age = " + a4.age+ ":a4.name: " +a4.name+ ":a4.mammal: " +a4.mammal);
        System.out.println();

        Animal a5 = new Animal(13, "King");
        System.out.println("a5.age = " + a5.age+ ":a5.name: " +a5.name+ ":a5.mammal: " +a5.mammal);
        System.out.println();

        Animal a6 = new Animal();
        System.out.println("a6.age = " + a6.age+ " :a6.name: " +a6.name+ ":a6.mammal: " +a6.mammal);
        System.out.println();

        Animal a7 = new Animal(5);
        System.out.println("a7.age = " + a7.age+ ":a7.name: " +a7.name+ ":a7.mammal: " +a7.mammal);




    }

}
