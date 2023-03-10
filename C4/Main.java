import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String separador="\u001B[31m ============================== \u001B[0m";
        String separador2="\u001B[35m ============================== \u001B[0m";
        String separador3="\u001B[33m ============================== \u001B[0m";

        Producto cofee= new Producto("cafe");
        System.out.println(cofee.getAll());

        System.out.println(separador);

        cofee.setNombre("Cafe descafeinado");
        cofee.setMarca("Java");
        cofee.setDescuento(15);
        cofee.setPresentacion("250gr");
        cofee.setPrecio(580);

        System.out.println(separador);

        System.out.println(cofee.getAll());



        Persona seniora= new Persona("Marta", "Juarez", "25/10/1965");
        seniora.getEdad();

        Persona senior= new Persona("Sergia", "Peralta", "16/04/1973");
        senior.getEdad();

        Persona joven= new Persona("Karina", "Mercado", "09/10/2003");
        joven.getEdad();

        Persona profesor=new Persona("Lucas", "Prado", "18/11/1996");
        profesor.getEdad();

        System.out.println(separador);

        Producto nulo=new Producto(" ", 0, "");
        Producto jabon=new Producto("Jabon en polvo maquina", 40, "400grs");
        Producto esponja=new Producto("Esponja limpiadora", 10, "pack 1 unidad");
        Producto candy=new Producto("Chocolate", 100, "25grs");

        System.out.println(jabon.getAll());
        System.out.println(esponja.getAll());
        System.out.println(candy.getAll());

        System.out.println(separador);

        jabon.setMarca("Burbuja");
        esponja.setMarca("Patricio EStrella");
        candy.setMarca("Roca Feller");

        System.out.println(separador);

        System.out.println(jabon.getAll());
        System.out.println(esponja.getAll());
        System.out.println(candy.getAll());

        System.out.println(separador);
        System.out.println(separador2);


        Carrito n1=new Carrito(seniora);
        n1.addCompra(candy, nulo, nulo);
        System.out.println(n1.costoTotal());

        System.out.println(separador);

        Carrito n2=new Carrito(joven);
        n2.addCompra(jabon, esponja, nulo);
        System.out.println(n2.costoTotal());

        System.out.println(separador);

        Carrito n3=new Carrito(senior);
        n3.addCompra(cofee, candy, esponja);
        System.out.println(n3.costoParcial());
        System.out.println(n3.costoTotal());

        System.out.println(separador3);

        Carrito n4=new Carrito(profesor);
        n4.addCompra(jabon, esponja, candy);

        System.out.println("ejercicio resuelto\n" + profesor.getNombre() + "\ncompro: "+ n4.compra()+"\nGastando:\n" +n4.costoTotal() );

        System.out.println(separador3);












    }
}