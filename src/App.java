public class App {

    public static void main(String[] args) throws Exception {

        int[] numeros = {5, 10, 20, 2, 40, 33, 7, 22, 4, 39, 1};
        System.err.println("Arreglo original: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        Merge merge = new Merge();

        merge.mergeSort(numeros, 0, numeros.length - 1);

        System.out.println("\nArreglo ordenado:");

        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}