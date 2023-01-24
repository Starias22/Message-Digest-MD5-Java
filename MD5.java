import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;

public class MD5{
    /**Thhis class defines the function md5 which encryp a string using the MD5 algorithm* */

    public static void main(String[] args) {
        String str;
        System.out.println("***************Message digest Algorith in Java****************");

        str="my string";
        System.out.println("MD5('"+str+"')= "+getMd5(str));

        str="another string 5469";
       System.out.println("MD5('"+str+"')= "+getMd5(str));

       str="Ad vjig 10%:";
       System.out.println("MD5('"+str+"')= "+getMd5(str));


       str="another string 5469";
       System.out.println("MD5('"+str+"')= "+getMd5(str));

       System.out.println(getMd5("char").length());
    
    }

    public final  static String getMd5(String password) {

        try {

            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // digest() method is called to calculate message digest
            // of an input digest() return array of byte
            byte[] messageDigest = md.digest(password.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            StringBuilder hashtext = new StringBuilder(no.toString(16));
            while (hashtext.length() < 32) {
                hashtext.insert(0, "0");
            }
            return hashtext.toString();
        }

        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}