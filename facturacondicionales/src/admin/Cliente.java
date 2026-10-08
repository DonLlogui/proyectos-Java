
package admin;



/**
 *
 * @author Ing Guillo
 */
public class Cliente {
   private  int id;
   private String identificacion;
   private String nombres;
    private String Telefono;
   private String Correo;

    public Cliente(int id, String identificacion, String nombres, String Telefono, String Correo) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.Telefono = Telefono;
        this.Correo = Correo;
    }

    public int mostrarNumero() {
        return id;
    }

    public void editarNumero(int id) {
        this.id = id;
    }

    public String mostrarIde() {
        return identificacion;
    }

    public void ediarIde(String identificacion) {
        this.identificacion = identificacion;
    }

    public String mostrarNom() {
        return nombres;
    }

    public void editarNom(String nombres) {
        this.nombres = nombres;
    }

    public String mostrarTel() {
        return Telefono;
    }

    public void editarTel(String Telefono) {
        this.Telefono = Telefono;
    }

    public String mostrarEmail() {
        return Correo;
    }

    public void editarEmail(String Correo) {
        this.Correo = Correo;
    }
    
     public String imprimirCliente(){
         return """
                ============Datos del Cliente============
                - # """ + mostrarNumero() + "/n" 
                 + "- Identificacion: " + mostrarIde() + "\n"
                 + "- Nombres: " + mostrarNom() + "\n"
                 + "- Telefonor: " + mostrarTel() + "\n"
                 + "==========================================="         
                 ;
                 
      }
    
}
