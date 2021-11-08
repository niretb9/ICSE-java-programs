package File.Encryption;

public class Crypto {
    public static String encrypt(String m){
        String ret = "";
        for(int i=0;i<m.length();i++){
            if(i%2==0){
                int j = m.charAt(i)+5;
                String temp = Character.toString((char)j);
                ret = ret+temp;
            }
            else{
                int j = m.charAt(i)-3;;
                String temp = Character.toString((char)j);
                ret = ret+temp;
            }
        }
        return ret;
    }

    public static String decrypt(String m){
        String ret = "";
        for(int i=0;i<m.length();i++){
            if(i%2==0){
                int j = m.charAt(i)-5;
                String temp = Character.toString((char)j);
                ret = ret+temp;
            }
            else{
                int j = m.charAt(i)+3;;
                String temp = Character.toString((char)j);
                ret = ret+temp;
            }
        }
        return ret;
    }
}
