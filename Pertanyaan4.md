1. Cukup ubah kondisi > menjadi < pada while di insertionSort():
javavoid insertionSort() {
    for (int i = 1; i < listMhs.length; i++) {
        Mahasiswa14 temp = listMhs[i];
        int j = i;
        while (j > 0 && listMhs[j-1].ipk < temp.ipk) { // < jadi descending
            listMhs[j] = listMhs[j-1];
            j--;
        }
        listMhs[j] = temp;
    }
}
Hasilnya data akan terurut dari IPK tertinggi ke terendah (DESC). 