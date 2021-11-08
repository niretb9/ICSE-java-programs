package File.Encryption;

public class HyperCrypt {
    public static String encrypt(String m){
        String ret = "Encrypted data:";
        for(int i=0;i<m.length();i++){
            if(i%2==0){
                int j = m.charAt(i)+11;
                String temp = Character.toString((char)j);
                ret = ret+temp;
            }
            else{
                int j = m.charAt(i)+13;;
                String temp = Character.toString((char)j);
                ret = ret+temp;
            }
        }
        return ret;
    }

    public static String decrypt(String m){
        String ret = "";
        for(int i=15;i<m.length();i++){
            if(i%2==1){
                int j = m.charAt(i)-11;
                String temp = Character.toString((char)j);
                ret = ret+temp;
            }
            else{
                int j = m.charAt(i)-13;;
                String temp = Character.toString((char)j);
                ret = ret+temp;
            }
        }
        return ret;
    }
}