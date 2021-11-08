package Inheritance;


public class basePro {
    int n1, n2;
    public void enter(int x, int y){
        n1 = x;
        n2 = y;
    }

    public void show(){
        System.out.println(n1);
        System.out.println(n2);
    }
}

class dervPro extends basePro{
    float result;
    public void prod(){
        result = n1*n2;
    }

    public void disp(){
        System.out.println("The Product is: "+result);
    }

    public static void main(String[] args){
        dervPro a = new dervPro();
        a.enter(3,5);
        a.show();
        a.prod();
        a.disp();
    }
}
