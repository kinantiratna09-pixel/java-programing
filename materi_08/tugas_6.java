package materi_08;

import java.util.Scanner;
// Mengimpor kelas Scanner untuk input dari pengguna

public class tugas_6 {
// Mendefinisikan kelas publik bernama tugas_6

    public static void main(String[] args) {
    // Metode utama, titik awal eksekusi program

        Scanner input = new Scanner(System.in);
        // Membuat objek Scanner untuk membaca input dari keyboard

        int angka;
        // Mendeklarasikan variabel 'angka' untuk menyimpan input pengguna

        int total = 0;
        // Mendeklarasikan variabel 'total' untuk menyimpan hasil penjumlahan

        for (int i = 1; i <= 5; i++) {
        // Melakukan perulangan sebanyak 5 kali (i dari 1 sampai 5)

            System.out.print("Masukkan angka ke-" + i + ": ");
            // Menampilkan pesan untuk meminta input angka ke-i

            angka = input.nextInt();
            // Membaca input angka dari pengguna

            if (angka % 5 != 0) {
            // Mengecek apakah angka yang dimasukkan TIDAK habis dibagi 5

                continue;
                // Jika tidak habis dibagi 5, lewati iterasi ini (angka tidak dijumlahkan)

            }

            total += angka;
            // Jika angka habis dibagi 5, tambahkan ke total

        }   

        System.out.println(" Hasil Penjumlahan Adalah: " + total);
        // Menampilkan hasil penjumlahan angka-angka yang habis dibagi 5

    }
}