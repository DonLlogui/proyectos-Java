
package admin;

/**
 *
 * @author Ing Guillo
 */
public class Login {
    private String usuario1;
    private String contrasena1;

    public Login() {
        this.usuario1 = "pepito";
        this.contrasena1 = "12345";
    }
    
    public String veriifcar(String u , String c){
       String  m = "0";
                if(u.equals(usuario1) && c.equals(contrasena1)){
                    m = "1";
                }
        return m;
    }
    
    
    
}
