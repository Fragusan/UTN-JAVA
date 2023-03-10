import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
public class Carrito {
    private Persona cliente;

    private String ID;
    private String fechaDeCompra;
    private static Producto[] compra= new Producto[3];

    public Carrito(Persona cliente) {
        this.cliente = cliente;
        this.compra = compra;
        this.ID = java.util.UUID.randomUUID().toString();
        this.fechaDeCompra = Producto.timeStamp();
    }
    public float costoParcial(){
        float parcial=0;
        if (this.compra.length == 0){
            return parcial;
        }else {
            for (int i = 0; i < this.compra.length; i++) {
                parcial = parcial + compra[i].getPrecio();
            }
            return parcial;
        }
    }

    public float costoTotal(){
        float total=0;
        if (this.compra.length == 0){
            return total;
        }else {
            for (int i = 0; i < this.compra.length; i++) {
                total = total + compra[i].getCostoFinal();
            }
            return total;
        }
    }

    public String compra(){
        String compro="";
        if (this.compra.length == 0){
            return "RATA, no compro nada";
        }else {
            for (int i = 0; i < this.compra.length; i++) {
                compro = compro+"\n" + compra[i].getNombre();
            }
            return compro;
        }
    }

    public Persona getCliente() {
        return cliente;
    }

    public Producto[] getCompra() {
        return compra;
    }
    public int getCantidadArticulos(){
        return compra.length;
    }

    public String getID() {
        return ID;
    }

    public String getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public void addCompra(Producto itemA, Producto itemB, Producto itemC) {
        this.compra[0]=itemA ;
        this.compra[1]=itemB ;
        this.compra[2]=itemC ;
    }
}
