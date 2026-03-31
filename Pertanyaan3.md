Kode tersebut berfungsi untuk mencari indeks elemen dengan IPK terkecil dari posisi i+1 hingga akhir array.

idxMin = i → asumsikan posisi i adalah yang terkecil dulu
Loop j mulai dari i+1 → bandingkan satu per satu ke kanan
if (listMhs[j].ipk < listMhs[idxMin].ipk) → jika ada yang lebih kecil, perbarui idxMin

Setelah loop selesai, idxMin menyimpan posisi elemen dengan IPK terkecil, lalu ditukar ke posisi i agar data terurut ascending.Sonnet 4.6