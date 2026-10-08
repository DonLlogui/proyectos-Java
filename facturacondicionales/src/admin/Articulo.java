
package admin;


/**
 *
 * @author Ing Guillo
 */
public class Articulo {
    private int id;
    private String producto;
    private int cantidad;
    private double valoru;
   String des = "0%";

    public Articulo(int id, String producto, int cantidad, double valoru) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.valoru = valoru;
    }

    public int mostrarId() {
        return id;
    }

    public void editarId(int id) {
        this.id = id;
    }

    public String mostarArticulo() {
        return producto;
    }

    public void editarArticulo(String producto) {
        this.producto = producto;
    }

    public int mostrarCan() {
        return cantidad;
    }

    public void editarCan(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double mostrarValor() {
        return valoru;
    }

    public void editarValor(double valoru) {
        this.valoru = valoru;
    }
    
     public Double calculoSubtotal() {
         double subtotal;
        subtotal =  this.valoru * this.cantidad;
        return subtotal;
    }

     public Double calculoIva() {
         double iva;
        iva =  calculoSubtotal() * 0.19;
        return iva;
    }
     
   
      public Double calculoTotal() {
         double total;
        total =  calculoSubtotal() +  calculoIva();
        return total;
    }
      
      public Double calculoDescuento(){
          double descuento = 0;
                if(calculoTotal() >= 50000 && calculoTotal() < 100000){
                     descuento = calculoTotal() - (calculoSubtotal() * 0.05);
                     descu("5%");
                }else{
                    if (calculoTotal() >= 100000 && calculoTotal() < 200000){
                      descuento = calculoTotal() - (calculoSubtotal() * 0.075); 
                       descu("7.5%");
                    }else{
                      if (calculoTotal() >= 200000){  
                         descuento = calculoTotal() - (calculoSubtotal() * 0.1);
                         descu("10%");
                       }
                    }
                }// cerrar calculo
                return descuento;
      }
      
      public void descu (String d){
          this.des = d;
      }
    
      
      public String imprimirProducto(){
          double descuento = calculoDescuento();
          
          return """
                 ============Datos del Cliente============ 
                 # """ + mostrarId() + "\n" 
                 + "- Producto: " + mostarArticulo() + "\n"
                 + "- cantidad: " + mostrarCan() + "\n"
                 + "- valor Unitario: " + mostrarValor() + "\n"
                 + "=========================================== \n"         
                 + "- Subtotal: " + calculoSubtotal() + "\n"
                 + "=========================================== \n"
                 + "- iva: " + calculoIva() + "\n"
                 + "=========================================== \n"
                 + "- descuento  " + des + ": " + descuento + "\n"
                 + "=========================================== \n"
                 + "- Total: " + calculoTotal() + "\n"
                 + "=========================================== \n"
                 ;
                 
      }
}