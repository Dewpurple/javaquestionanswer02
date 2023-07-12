package udemy.constructor;

public class BirdSeed {
    private int numberBags;
    boolean call;

    public BirdSeed(){
        this.numberBags=11;
        this.call=false;

    }


    public BirdSeed(int numberBags){//numberBags=7
        this.numberBags=numberBags;// this.numberBags=7;
        this.call=true;

    }

    public static void main(String[] args) {
        BirdSeed seed1= new BirdSeed(7);//go to constructor who has one int parameter
        System.out.println("seed1.numberBags = " + seed1.numberBags);//7
        System.out.println("seed1.call = " + seed1.call);//true


        BirdSeed seed2= new BirdSeed();//go to without parameter constructor
        System.out.println("seed2.numberBags = " + seed2.numberBags);//11
        System.out.println("seed2.call = " + seed2.call);//false



    }
}
