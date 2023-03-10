import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
public class Producto {

    private String nombre;
    private String code;
    private String marca;
    private float precio;
    private float descuento;
    private String presentacion;
    private float costoFinal;

    private String ultimaModificacion;

    private static String presentacionDefault="0g/0cm3";
    private static float descuentoDefault=0;
    private static String marcaDefault= "Great Día";
    private static float precioDefault=1000;

    public Producto(String nombre, String marca, float precio, String presentacion) {
        this.nombre = nombre;
        this.marca=marca;
        this.presentacion=presentacion;
        this.code=java.util.UUID.randomUUID().toString();
        this.precio = precio;
        this.descuento=descuentoDefault;
        this.ultimaModificacion= timeStamp();
    }

    public Producto(String nombre, float precio, String presentacion) {
        this.nombre = nombre;
        this.marca=marcaDefault;
        this.presentacion=presentacion;
        this.code=java.util.UUID.randomUUID().toString();
        this.precio=precio;
        this.descuento=descuentoDefault;
        this.ultimaModificacion=timeStamp();
    }

    public Producto(String nombre) {
        this.nombre = nombre;
        this.marca=marcaDefault;
        this.presentacion=presentacionDefault;
        this.code=java.util.UUID.randomUUID().toString();
        this.precio=precioDefault;
        this.descuento=descuentoDefault;
        this.ultimaModificacion=timeStamp();
    }

    public static String timeStamp(){
        LocalDateTime currentTime=LocalDateTime.now();
        String generate=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(currentTime);
        return generate;
    }
    public float getCostoFinal(){
        return getPrecio() - ((getPrecio()) * (getDescuento()/100));
    }

    public String getAll(){
        return getNombre() +"\n" + getMarca() +"\n" + getPresentacion() +"\n" + getCode() +"\n" + getPrecio() +"\n" + getDescuento() +"\n" + getCostoFinal() + "\n" + getUltimaModificacion();
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getPresentacion() {
        return this.presentacion;
    }

    public String getCode() {
        return this.code;
    }

    public float getPrecio() {
        return this.precio;
    }

    public float getDescuento() {
        return this.descuento;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    //setter´s
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void  setPresentacion(String presentacion){
        this.presentacion=presentacion;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
