import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class SecondA {
    public static void operador(String path, String operacion) {
            try{
                List<String> data=Files.readAllLines(Paths.get(path));
                operacion=operacion.toUpperCase();
                int total=0;

                if(operacion.charAt(0) == 'M'){
                    total=1;
                    for(String e: data){
                        total= total * Integer.parseInt(e);
                    }

                }else if( operacion.charAt(0) == 'S' || operacion == null){
                    total=0;
                    for(String e: data){
                        total= total + Integer.parseInt(e);
                    }
                }
                System.out.println("\u001B[34mEl total de la operacion\u001B[35m "+ operacion +"\u001B[34m es: \n\u001B[36m" + total +"\u001B[0m");
            }
            catch(IOException e){
                e.printStackTrace();
            }
    }

    public static  void operador(String path){
        operador(path, "suma");
    }

    public static void main(String[] args) {
        //System.out.println(Files.exists(Paths.get("src/src/input.txt")));;
        operador("src/src/input.txt", "multiplica");
        operador("src/src/input.txt", "s");
        operador("src/src/input.txt", "mulTIPLIcaR");
        operador("src/src/input.txt");
        operador("src/src/input.txt", "sUmAAA");
    }
}