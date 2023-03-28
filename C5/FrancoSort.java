import java.util.Arrays;
public class FrancoSort {
    //Metodo basico de ordenamiento (predeterminado en ascendente)
    public static void sort(int[] arr) {
        sort(arr, true);
    }
    //**************************************__Sobrecarga del metodo__**************************************
    //Metodo que espera un parametro para saber si ira ascendente o descendente asc(boolean)
    public static void sort(int[] arr, boolean asc) {
        quickSort(arr, 0, arr.length - 1, asc);
        System.out.println("\u001B[32mEl arreglo ordenado es: \u001B[35m" + Arrays.toString(arr) +"\u001B[0m");
    }

    //Metodo recursivo (espero que no se me explote)
    private static void quickSort(int[] arr, int izq, int der, boolean asc) {
        if (izq < der) {
            int pivotIndex = partition(arr, izq, der, asc);
            quickSort(arr, izq, pivotIndex - 1, asc);
            quickSort(arr, pivotIndex + 1, der, asc);
        }
    }

    //Este metodo gestiona la particion para el ordenamiento
    private static int partition(int[] arr, int left, int right, boolean asc) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if ((asc && arr[j] <= pivot) || (!asc && arr[j] >= pivot)) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    // metodo estatico auxiliar utilizado para realizar los swaping necesarios en "partition"
    private static void swap(int[] arr, int i, int j) {
        int aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;
    }

}