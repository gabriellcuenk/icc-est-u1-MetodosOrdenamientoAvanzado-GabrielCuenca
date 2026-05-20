public class Merge {

    // metodo que inicia el merge sort
    public void mergeSort(int[] arr, int izquierda, int derecha) {

        // verifica que el arreglo pueda dividirse
        if (izquierda < derecha) {

            // calcula el punto medio
            int medio = (izquierda + derecha) / 2;

            // ordena la parte izquierda
            mergeSort(arr, izquierda, medio);

            // ordena la parte derecha
            mergeSort(arr, medio + 1, derecha);

            // une las partes ordenadas
            merge(arr, izquierda, medio, derecha);
        }
    }

    // metodo que une las dos mitades
    public void merge(int[] arr, int izquierda, int medio, int derecha) {

        // tamaño de los subarreglos
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        // arreglos temporales
        int[] izquierdaArr = new int[n1];
        int[] derechaArr = new int[n2];

        // copia datos al arreglo izquierdo
        for (int i = 0; i < n1; i++) {
            izquierdaArr[i] = arr[izquierda + i];
        }

        // copia datos al arreglo derecho
        for (int j = 0; j < n2; j++) {
            derechaArr[j] = arr[medio + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = izquierda;

        // compara y ordena elementos
        while (i < n1 && j < n2) {

            if (izquierdaArr[i] <= derechaArr[j]) {
                arr[k] = izquierdaArr[i];
                i++;
            } else {
                arr[k] = derechaArr[j];
                j++;
            }

            k++;
        }

        // copia elementos restantes del izquierdo
        while (i < n1) {
            arr[k] = izquierdaArr[i];
            i++;
            k++;
        }

        // copia elementos restantes del derecho
        while (j < n2) {
            arr[k] = derechaArr[j];
            j++;
            k++;
        }
    }
}