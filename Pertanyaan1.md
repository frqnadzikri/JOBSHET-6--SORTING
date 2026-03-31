1. Fungsi kode tersebut:
Menukar dua elemen array yang bersebelahan jika elemen kiri lebih besar dari kanan — ini adalah proses swap pada Bubble Sort untuk mengurutkan data ascending.

2. Kode pencarian nilai minimum pada Selection Sort:
cif (data[j] < data[min_idx]) {
    min_idx = j;
}

3. Maksud kondisi while (j >= 0 && data[j] > temp):

j >= 0 → agar tidak keluar batas array
data[j] > temp → selama elemen masih lebih besar dari nilai yang akan disisipkan

Keduanya memastikan perulangan berhenti di posisi yang tepat untuk menyisipkan temp.

4. Tujuan data[j+1] = data[j]:
Menggeser elemen satu posisi ke kanan untuk memberi ruang bagi elemen yang akan disisipkan.