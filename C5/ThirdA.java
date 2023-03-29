import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class ThirdA {

    public static int getIndexOf(char str, char[] arr){
        int len=arr.length;
        int i=0;
        while ( i < len){
            if(arr[i] == str){
                return i;
            }else{ i++;}
        }
        return -1;
    }

    public static void cifrar(String path1, int y, String path){
        try{
            String x=Files.readString(Paths.get(path1));
            String exit="";
            for (int i = 0; i < x.length() ; i++) {
                char[] dicc= new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
                char find=Character.toLowerCase(x.charAt(i));
                //la posicion del caracter en el diccionario
                int reference=getIndexOf(find, dicc);
                int lon=reference + y;

                //manejo del desbordamiento (para casos donde el valor sea >= 27)
                if((lon) > dicc.length){
                    int patch=(lon) - (dicc.length);
                    if(patch < 0){exit= exit + dicc[patch*-1];
                    }else if((lon) == dicc.length-1){
                        exit= exit + dicc[lon-1];
                    } else{
                        exit = exit + dicc[patch];
                    }
                }
                //para el caso menor que 27
                if((lon) < dicc.length-1){
                    exit=exit + dicc[lon];
                }

                if((lon) == dicc.length-1){
                    exit = exit + "\s";
                }
            }

            Files.writeString(Paths.get(path), exit);
            System.out.println("\u001B[36mLa codificación termino de manera satisfactoria.\u001B[0m");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("\u001B[36mOcurrió un error intentando realizar la operación.\u001B[0m");
        }
    }

    public static void decode(String path1, int y, String path2){
        try{
            String output="";
            String input=Files.readString(Paths.get(path1));
            char[] dicc= new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};

            for(int i=0; i< input.length(); i++){
                char find=Character.toLowerCase(input.charAt(i));
                int reference=getIndexOf(find, dicc);
                int lon=reference - y;

                //Manejo de casos
                if(lon >0){
                    output=output + dicc[lon];
                }

                if(lon == 0){
                    if(i==1 || i==2){System.out.println("caso2" + i + find+"\n"+dicc[27-y]);}
                    output=output + dicc[27-y];
                }

                if(lon < 0){
                    if(i==1 || i==2){System.out.println("caso3");}
                    lon=Math.abs(lon);
                    if(lon == 1){ output=output + "\s";}
                    else{ output=output + dicc[27-lon];}
                }

            }

            Files.writeString(Paths.get(path2), output);
            System.out.println("\u001B[34mLa decodificación termino de manera satisfactoria.\u001B[0m");
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("\u001B[36mOcurrió un error intentando realizar la operación.\u001B[0m");
        }
    }

    public static void Cesar(String entrada, String salida, int salto, char opcion){
         if(Character.toUpperCase(opcion) == 'C'){
             cifrar(entrada, salto, salida);
         }else if(Character.toUpperCase(opcion) == 'D'){
             decode(entrada, salto, salida);
         }else{
             System.out.println("\u001B[31mNo selecciono una de las opciones disponibles\u001B[0m");
         }
    }

    public static void Cesar(){
        System.out.println("\u001B[32m¿Sabe para que ejecuto esta función?");
    }
    public static void main(String[] args) {

        //Debería devolver <<rtkogtbogpuclg>>
        //System.out.println(cifradoCesar("primer mensaje", 2));
        //cifrar("nueva palabra", 5, "src/src/code.txt");
        //cifrar("Ahora si funciona como la maquina enigma signo de pregunta", 5, "src/src/code.txt");
        //decode("src/src/code.txt", 5, "src/src/decode.txt");
        Cesar("src/src/inputCode.txt", "src/src/code00.txt", 10, 'c');
        Cesar("src/src/code00.txt", "src/src/decode00.txt", 10, 'd');

    }
}
