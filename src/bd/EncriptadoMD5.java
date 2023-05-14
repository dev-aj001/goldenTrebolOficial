package bd;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;
/**
 *
 * @author jairi
 */
public class EncriptadoMD5 {
    String secretKey = "hola123";
    
    public String encode(String cad){
        String encriptacion = "";
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] llavePass = md5.digest(secretKey.getBytes("utf-8"));
            byte[] byteKey = Arrays.copyOf(llavePass, 24);
            SecretKey key = new SecretKeySpec(byteKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE, key);
            
            byte[] plainTextBytes = cad.getBytes("utf-8");
            byte[] buffer = cifrado.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buffer);
            encriptacion = new String(base64Bytes);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"algo salió mal");
        }
        return encriptacion;
    }
    
    public String decode(String cadEncriptada){
        String desencriptacion = "";
        try {
            byte[] message = Base64.decodeBase64(cadEncriptada.getBytes("utf-8"));
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digestOfPass = md5.digest(secretKey.getBytes("utf-8"));
            byte[] keyByte = Arrays.copyOf(digestOfPass, 24);
            SecretKey key = new SecretKeySpec(keyByte, "DESede");
            Cipher decifrado = Cipher.getInstance("DESede");
            decifrado.init(Cipher.DECRYPT_MODE, key);
            
            byte[] plainTextBytes = decifrado.doFinal(message);
            desencriptacion = new String(plainTextBytes, "UTF-8");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"algo salió mal");           
        }
        
        return desencriptacion;
    }
    
}