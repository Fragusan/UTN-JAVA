import java.time.LocalDate;
import java.time.Period;
import  java.time.format.DateTimeFormatter;
public class Persona {

    private String nombre;
    private String apellido;
    private String nacimiento;
    private String ID;

    public Persona (String name, String lastName, String birth){
        this.nombre=name;
        this.apellido=lastName;
        this.nacimiento=birth;
        this.ID=java.util.UUID.randomUUID().toString();

    }
    public String getNombre(){
        return this.nombre + " " + this.apellido;
    }

    public String getID(){
        return this.ID;
    }

    public int getEdad(){
        DateTimeFormatter fmt= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nacimiento= LocalDate.parse(this.nacimiento, fmt);
        LocalDate current= LocalDate.now();

        Period periodo= Period.between(nacimiento, current);
        System.out.printf("La edad de \u001B[32m%s\u001B[0m es de \u001B[33m%s\u001B[0m años, \u001B[36m%s\u001B[0m meses y \u001B[36m%s\u001B[0m días", this.getNombre(), periodo.getYears(), periodo.getMonths(), periodo.getDays());
        return periodo.getYears() ;

    }
}
