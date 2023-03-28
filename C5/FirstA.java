public class FirstA {
    public static  void sort( int n1, int n2, int n3, char orden){
        try{
            int[] aux={ n1,n2, n3};
            boolean metodo= (orden == 'a')? true : false;
            FrancoSort.sort(aux, metodo);
        }catch (Exception e){
            System.out.println("\u001B[31m Revise los parametros ingresados y reintente por favor \u001B[0m");
        }
    }
}
