public class FirstB {

    static int [] number(int x, int y, int z, String set){
        int del[]= new int []{0};
        int aux[]= new int[3];
        int a=x;
        int b=y;
        int c=z;
        int swap;
        String orden= set;
        orden=orden.toUpperCase();

        if (orden.equals("DES")) {
            System.out.println("Entro en descendientes");
            //931 caso de orden inverso
            if(a>b && a>c){
                aux[2]=a;
                if ( b>c) {
                    aux[1]=b;
                    aux[0]=c;
                    System.out.println("quedo ordenado:");
                    for (int i = 0; i <aux.length ; i++) {
                        System.out.println(aux[i]);
                    }

                    return aux;
                }
            }
            //857
            if (a>b && a>c) {
                aux[2]=a;
                if (b<c) {
                    aux[1]=c;
                    aux[0]=b;
                    System.out.println("quedo ordenado:");
                    for (int i = 0; i <aux.length ; i++) {
                        System.out.println(aux[i]);
                    }
                    return aux;
                }
            }
        }
        if (orden.equals("ASC")) {
            System.out.println("Entro en ascendentes");
        }
        System.out.println("nada");
        return del;
    }
    public static void main(String[] args) {
        System.out.println(number(3,4,8,"asc"));

        System.out.println(number(6,1,8,"des"));

        System.out.println(number(9,3,1,"des"));

        System.out.println(number(8,5,7,"des"));
    }
}
