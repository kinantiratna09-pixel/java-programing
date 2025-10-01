package materi_06;
import java.util.Scanner;
// Digunakan untuk mengimpor kelas Scanner dari paket java.util

public class percabanganif_1 {
// Mendefinisikan kelas publik bernama percabanganif_1
    public static void main(String[] args) {
        // Metode utama yang akan di eksekusi saat program dijalankan
        Scanner input = new Scanner(System.in);
        // Membuat objek Scanner untuk membaca input dari pengguna
        int belanja;
        // Mendeklarasikan variabel integer bernama belanja

        System.out.print("Masukkan total belanjaan Anda: ");
        //Meminta user untuk menginput total belanjaan
        belanja = input.nextInt();
        //Membaca input dari user dan menyimpannya dalam variabel belanja

        if(belanja>= 500000){
            //Percabangan if untuk mengecek apakah belanja lebih dari atau sama dengan 500000
            System.out.print("Selamat! Anda Mendapatkan hadih gantungan kunci");
            //Jika kondisi terpenuhi, maka akan mencetak pesan hadiah

        }
    }
}
