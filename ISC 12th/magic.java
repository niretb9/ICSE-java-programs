public class magic {
    public static int magic(int n)  {
        if(n == 0){
            return 0;
        }
        else
            System.out.println(n);
            return magic(n/2) * 10 + (n%2);

    }

    public static void main(String[] args){
        magic(7);
    }
}
