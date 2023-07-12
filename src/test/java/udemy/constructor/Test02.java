package udemy.constructor;

public class Test02 {
    public Test02() {
        System.out.println("*********non parameter Constructor**********");
    }

    public Test02(int i) {
        this();
        System.out.println("*********Constructor whose 1 int parameter*********");
    }

    public Test02(int i,int k) {
        this(7);
        System.out.println("*********Constructor whose 2 int parameter*********");
    }


    public static void main(String[] args) {
        System.out.println("*****obj1*****");
        Test02 obj1=new Test02(5);
        System.out.println();
        System.out.println("*****obj2*****");
        System.out.println();
        Test02 obj2=new Test02(3,5);
    }
}
