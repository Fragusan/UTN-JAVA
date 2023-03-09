public class Main {
    public static void main(String[] args) {
            //a- Uso de while con dos variables
            int start=15;
            int end=45;
            int aux = start;
        System.out.println("\033[35m\nNum inicial=15\nNum final=45\nTrabajando dentro de ese rango...");
            while(aux <= end){
                System.out.println("\033[31m" + aux);
                aux++;
            }

            //b - Mostrar solo números pares
            System.out.println("\n\n\n \033[33m Segundo inciso\n \033[35m Se filtraran de los anteriores solos los números pares\n");
            aux = start;
            while(aux <= end){
                if(aux % 2 == 0){
                    System.out.println("\033[36m" + aux);
                }
                aux++;
            }

            //c - usando una bandera se selecciona si se muestran pares o impares
            System.out.println("\n\n \033[33m Tercer inciso\n \033[35m Se debe setear la variable para ver pares/impares \n");

            aux = start;
            int acc=0;
            String flag="impares";
            System.out.println("actualmente seteado en " + flag);
            while(aux <= end){
                if(flag == "pares"){
                    if(aux % 2 == 0){
                        System.out.println("\033[36m" + aux);
                        acc++;
                    }
                    aux++;
                }
                if(flag != "pares"){
                    if(aux % 2 != 0){
                        System.out.println("\033[32m" + aux);
                        acc++;
                    }
                    aux++;
                }

            }
            System.out.println("\033[34m Se encontraron " + acc + " números " + flag);

            //d - utilizar un bucle for e invertir el orden del ejercicio en (b)
        System.out.println("\033[33m\nCuarto inciso \nUtilizando bucle for (orden inverso)");
        aux = end;
            for (int i=start; i <= aux ; aux--) {
                if(aux % 2 == 0){
                    System.out.println("\033[36m" + aux);
                }
            }

            //2 d-
        System.out.println("\033[37m Ejercicio 2-D\nClasificar en categoria de ingreso");
                                        //valores para personas de otra categoria
            float ingresos=500000;      //320789;
            int vehiculos=5;            //2;
            boolean antiguedad=true;    //false;
            int inmuebles=4;            //1;
            boolean lujos=true;         //false;

            //prueba

            if ((ingresos >= 489083) && (vehiculos >= 3) && (antiguedad) && (inmuebles >=3) && (lujos)) {
                System.out.println("\033[31m ⚠ Esta persona pertenece a la categoria de altos ingresos");
            }else {
                System.out.println("\033[33m La persona ingresada no pertenece a cat 'Altos ingresos'");
            }
        }
    }

