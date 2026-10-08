
package admin;

import javax.swing.JOptionPane;

/**
 *
 * @author Ing Guillo
 */
public class Factura {

   
    public static void main(String[] args) {
       int idCliente =Integer.parseInt(JOptionPane.showInputDialog("ingrese id del cliente"));
       String idenCliente = JOptionPane.showInputDialog("ingrese identificacion del cliente");
       String nomCliente = JOptionPane.showInputDialog("ingrese nombres del cliente");
       String telCliente = JOptionPane.showInputDialog("ingrese Telefono del cliente");
       String emailCliente = JOptionPane.showInputDialog("ingrese Correo del cliente");
       Cliente persona = new Cliente(idCliente,idenCliente, nomCliente, telCliente, emailCliente);
       int idProducto = Integer.parseInt(JOptionPane.showInputDialog("ingrese id del Producto"));
       String producto = JOptionPane.showInputDialog("ingrese Producto");
       int cant =Integer.parseInt(JOptionPane.showInputDialog("ingrese id del cantidad del producto"));
       double valu =Double.parseDouble(JOptionPane.showInputDialog("ingrese id del valor unitario del producto"));
       Articulo productos = new Articulo(idProducto, producto, cant, valu);
       JOptionPane.showMessageDialog(null, persona.imprimirCliente() + "\n"
       + productos.imprimirProducto()
       ); 
       
    }
    
}
