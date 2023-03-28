public class C2_SecondA {

    static int getIndexOf(char str, char[] arr){
        int len=arr.length;
        int i=0;
        while ( i < len){
            if(arr[i] == str){
                return i;
            }else{ i++;}
        }
        return -1;
    }
    static String cifradoCesar(String x, int y){
        String exit="";


        for (int i = 0; i < x.length() ; i++) {
            char[] dicc= new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
            //tomo el indice del caracter de la palabra
            char find=Character.toLowerCase(x.charAt(i));
            //me devuelve la posicion en la que se encuentra en mi diccionario
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

        return "\u001B[0mLa palabra \u001B[33m\""+ x +"\"\u001B[0m codificada con \u001B[35m"+ y +"\u001B[0m caracteres quedó:\u001B[34m " + exit;
    }

    public static void main(String[] args){

        //Debería devolver <<rtkogtbogpuclg>>
        System.out.println(cifradoCesar("primer mensaje", 2));
        // cjqncbswgbvcn
        System.out.println(cifradoCesar("ahola que tal", 2));
        //cifrado con 5 lugares <<mtqf>>
        System.out.println(cifradoCesar("HOLA", 5));
        //cifrado con 10 (genera problemas con la 'q' que cae en el 'espacio')

        System.out.println(cifradoCesar("Soy la maquina enigma",10));
        //cifrado con 10
        System.out.println(cifradoCesar("ma  qui  na",10));
        //me van a funar los nazis :(
        System.out.println(cifradoCesar("q  u  i",10));
        System.out.println(cifradoCesar("q",10));
    }
    }