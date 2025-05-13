penjelasan penerapan konsep OOP (Object-Oriented Programming) dalam source code yang sudah kita bahas sebelumnya: Inheritance, Polymorphism, Encapsulation, dan Abstraction

1. Inheritance (Pewarisan)
   Pengertian:
Inheritance memungkinkan satu class mewarisi properti dan method dari class lain.

   Penjelasan:
AsuransiKesehatan dan AsuransiJiwa mewarisi class Asuransi.
Semua properti dan method yang ada di Asuransi bisa digunakan atau diubah di subclass-nya.

2. Polymorphism (Polimorfisme)
Pengertian:
Polymorphism memungkinkan method yang sama memiliki perilaku berbeda tergantung objek yang memanggilnya.

   Penjelasan:
Method hitungPremi() dideklarasikan di superclass (Asuransi) dan dioverride dengan perilaku berbeda pada subclass AsuransiKesehatan dan AsuransiJiwa.
Saat kamu memanggil hitungPremi() melalui referensi Asuransi, program akan memilih implementasi sesuai dengan objek aktualnya.

3.  Encapsulation (Enkapsulasi)
   Pengertian:
Encapsulation menyembunyikan data internal object dan hanya memperbolehkan akses melalui method getter/setter.

  Penjelasan:
Field id, nama, dan umur bersifat private → hanya bisa diakses lewat method getId(), getNama(), dan getUmur().
Ini melindungi data agar tidak dimodifikasi langsung dari luar class.

4. Abstraction (Abstraksi)
   Pengertian:
Abstraction menyembunyikan detail implementasi dan hanya menunjukkan fitur penting ke user.

  Penjelasan:
Interface LayananAsuransi mendefinisikan kontrak hitungPremi() → tanpa implementasi.
Asuransi adalah abstract class, artinya tidak bisa diinstansiasi langsung dan berisi method abstrak hitungPremi().
Subclass (AsuransiKesehatan, AsuransiJiwa) wajib mengimplementasikan method tersebut.
