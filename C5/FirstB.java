import java.util.Scanner;

public class FirstB {
    public static void sortCli(){
        try{
            int numeros[]= new int[3];
            Scanner input= new Scanner(System.in);
            System.out.println("\u001B[35mBienvenido\u001B[36m\nEste programa ordena tres números\n\u001B[33mPor favor ingrese el 1° número:\u001B[0m");

            for (int i = 0; i <numeros.length ; i++) {
                numeros[i]=input.nextInt();
                System.out.println("\u001B[33mPor favor ingrese el "+ (i+2) +"° número:\u001B[0m");
            }
            System.out.println("\u001B[33mSeleccione en que orden desea el ordenamiento\nReponda por favor utilizando el caracter entre asteriscos de acuerdo a lo necesitado\n\u001B[36m*a* para ascendente\n*d* para descendiente\ncualquier otro valor será tomado como descendente\u001B[0m");
            String aux=input.next();
            boolean metodo= (aux.charAt(0) == 'a')? true : false;
            FrancoSort.sort(numeros, metodo);

        }catch (Exception e){
            System.out.println("\u001B[31m Revise los parametros ingresados\u001B[0m");
        }
    }
}
