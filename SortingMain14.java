public class SortingMain14 {
    public static void main(String[] args) {
        int[] a = {20, 10, 2, 7, 12};

        Sorting14 dataurut1 = new Sorting14(a, a.length);

        System.out.print("Data awal: ");
        dataurut1.tampil();

        dataurut1.bubbleSort();

        System.out.print("Data setelah diurutkan (ASC): ");
        dataurut1.tampil();
    }
}