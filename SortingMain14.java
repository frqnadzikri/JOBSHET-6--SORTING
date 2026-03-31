public class SortingMain14 {
    public static void main(String[] args) {

        // Bubble Sort
        int[] a = {20, 10, 2, 7, 12};
        Sorting14 dataurut1 = new Sorting14(a, a.length);

        System.out.print("Data awal 1: ");
        dataurut1.tampil();

        dataurut1.bubbleSort();

        System.out.print("Bubble Sort (ASC): ");
        dataurut1.tampil();


        // Selection Sort
        int[] b = {30, 20, 2, 8, 14};
        Sorting14 dataurut2 = new Sorting14(b, b.length);

        System.out.print("\nData awal 2: ");
        dataurut2.tampil();

        dataurut2.selectionSort();

        System.out.print("Selection Sort (ASC): ");
        dataurut2.tampil();


        // Insertion Sort
        int[] c = {40, 10, 4, 9, 3};
        Sorting14 dataurut3 = new Sorting14(c, c.length);

        System.out.print("\nData awal 3: ");
        dataurut3.tampil();

        dataurut3.insertionSort();

        System.out.print("Insertion Sort (ASC): ");
        dataurut3.tampil();
    }
}