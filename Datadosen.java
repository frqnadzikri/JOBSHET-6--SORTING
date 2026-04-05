class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx = 0;

    // tambah data
    void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    // tampil data
    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    // Sorting ASC (Bubble Sort - termuda ke tertua)
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    // Sorting DSC (Selection Sort - tertua ke termuda)
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[max].usia) {
                    max = j;
                }
            }
            Dosen temp = dataDosen[max];
            dataDosen[max] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
}
