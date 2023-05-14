
package Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author jairi
 * Esta clase sirve para poder validar los correos electronicos, RFC, etc
 */

public class Validar {
    
    
    public boolean Email(String email){
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = patron.matcher(email);
        return matcher.find();
    }
    
    public boolean RFC(String RFC){
        Pattern patron = Pattern.compile("^(([A-Z]|[a-z]|\\s){1})(([A-Z]|[a-z]){3})([0-9]{6})((([A-Z]|[a-z]|[0-9]){3}))");
        Matcher matcher = patron.matcher(RFC);
        return matcher.find();
    }
    
}
