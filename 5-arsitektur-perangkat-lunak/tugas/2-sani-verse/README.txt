Studi kasus      : Store (SaniVerse)
Pattern wajib    : Observer Pattern dan Decorator Pattern
Pattern tambahan : Strategy Pattern

Penjelasan : Sebuah toko yang bernama SaniVerse menjual Augmented Reality (AR) yang dapat menampilkan gambar-gambar dinosaurus. Banyak pelanggan yang terus menerus bertanya kepada pemilik toko mengenai gambar terbaru yang dapat ditampilkan pada AR yang dijual di toko tersebut. Karena pemilik toko lelah dengan pertanyaan-pertanyaan para pelanggan yang terus menyerbu dan semakin banyak, pemilik toko meminta kepada seorang programmer untuk dibangun sebuah aplikasi yang dapat memberitahukan kepada semua pelanggan mengenai informasi terbaru di toko miliknya. Dari pemberitahuan tersebut, pelanggan dapat melanjutkan ke tahap pembelian. Di tahap pembelian, pelanggan memilih fitur-fitur (gambar) yang dapat ditampilkan pada AR yang diinginkan dan akan ditampilkan total biayanya.

Implementasi Pattern :
Observer Pattern  = Pemilik memberitahukan kepada seluruh pelanggan mengenai informasi terbaru di tokonya.
Decorator Pattern = Papan AR didekorasi menggunakan gambar-gambar dinosaurus.
Strategy Pattern  = Pelanggan memilih fitur-fitur yang diinginkan, yang mana setiap fitur memiliki harganya masing-masing.