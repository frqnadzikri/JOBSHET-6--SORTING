1a. Mengapa syarat perulangan i adalah i < listMhs.length-1 ?
Karena perulangan i menentukan berapa kali tahap bubble sort dilakukan. Untuk n data hanya perlu n-1 tahap, karena setelah n-1 tahap data sudah pasti terurut semua.

1b. Mengapa syarat perulangan j adalah j < listMhs.length-i ?
Karena setiap selesai 1 tahap, elemen terkecil (atau terbesar) sudah berada di posisi akhir yang benar, sehingga tidak perlu dibandingkan lagi. Makin besar i, makin sedikit elemen yang perlu dicek → efisiensi.

1c. Jika data = 50:

Perulangan i berlangsung 49 kali (n-1 = 50-1)
Tahap bubble sort yang ditempuh = 49 tahap