public class FirstB {


    public static void main(String[] args) {

        //en el caso de que ya este ordenado
        int[] arr0= {3,4,8};
        FrancoSort.sort(arr0);

        //se le pide en forma descendiente
        int[] arr1= {6,1,8};
        FrancoSort.sort(arr1,false);

        //se le pide en forma descendiente
        int[] arr2= {9,1,3};
        FrancoSort.sort(arr2,false);

        //se le pide en forma descendiente
        int[] arr3= {8,5,7};
        FrancoSort.sort(arr3,false);

        //Más heavy
        int[] arr4 = { 5, 3, 8, 4, 2 };
        FrancoSort.sort(arr4);
    }
}
