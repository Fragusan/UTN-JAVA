public class FirstC {
    static int sumarMayoresQueX(int[] x, int y){
        int acc=0;
        if (x.length == 0) {
            System.out.println("\u001B[35mNo se proporciono el vector de números\u001B[0m");
        }

        System.out.println("\u001B[0mLa sumatoria de los N° mayores que \u001B[34m"+ y+ "\u001B[0m es igual a: \u001B[32m");
        for (int i = 0; i < x.length; i++) {
            if ( x[i] > y) {
                acc= acc + x[i];
            }
        }
        return acc;
    }
    public static void main(String[] args) {
        //probando el metodo
        int n[]=new int[]{};
        System.out.println(sumarMayoresQueX(n, 2));

        n=new int[]{3,5,5};
        System.out.println(sumarMayoresQueX(n, 4));

        n= new int[]{2,4,6};
        System.out.println(sumarMayoresQueX(n,10));

        n=new int[]{5,8,9};
        System.out.println(sumarMayoresQueX(n,0));

    }
}