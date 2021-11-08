package Inheritance;

public class Calculation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers:"+z);
    }

    public void subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference of the given numbers:"+z);
    }
}

class MyCalculation extends Calculation {
    public void multiplication(int x, int y){
        z = x*y;
        System.out.println("The product of the given numbers:"+z);
    }

    public static void main(String[] args){
        MyCalculation demo = new MyCalculation();
        demo.addition(2,4);
        demo.subtraction(2,4);
        demo.multiplication(2,4);
    }
}
