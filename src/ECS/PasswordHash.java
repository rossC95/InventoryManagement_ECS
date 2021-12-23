package ECS;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class PasswordHash{
    private static final String ALGORITHM = "SHA-256";
  
    public static String hash(String password){
        try{
        // Returns a MessageDigest object that implements the specified digest algorithm.
        MessageDigest md = MessageDigest.getInstance(ALGORITHM);
        // Updates the digest using the specified byte.
        md.update(password.getBytes());
        // The hash computation is completed by performing final operations such as padding. 
        // The digest is reset after this call is made.
        byte[] hashedPassword = md.digest();
        
        StringBuilder sb = new StringBuilder();
        
        for(byte b : hashedPassword) {
            sb.append(String.format("%02x", b));
        }
        
        return sb.toString();
    } catch (NoSuchAlgorithmException e){
            System.out.println(e);
        } 
                
        return null;
    }
}
