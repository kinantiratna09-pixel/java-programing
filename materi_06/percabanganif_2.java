package materi_06;
import java.util.Scanner;
// Digunakan untuk mengimpor kelas Scanner dari paket java.util

public class percabanganif_2 {
// Mendefinisikan kelas publik bernama percabanganif_2
    public static void main(String[] args) {
        // Metode utama yang akan di eksekusi saat program dijalankan
        Scanner input = new Scanner(System.in);
        //membuat objek Scanner untuk membaca input dari pengguna
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

        } else {
            //Percabangan else untuk kondisi ketika belanja kurang dari 500000
            int selisihBelanja = 500000 - belanja;
            //Menghitung selisih belanja yang dibutuhkan untuk mencapai 500000
            System.out.println("Belanja anda kurang dari 5000000");
            //Jika kondisi tidak terpenuhi, maka akan mencetak pesan kurang
            System.out.println("Silahkan tambah lagi belanjanya senilai Rp. " + selisihBelanja);
            //jika kondisi tidak terpenuhi, maka akan mencetak pesan selisih belanja
            System.out.print("Agar bisa mendapat bonus gantungan kunci");
            //jika kondisi tidak terpenuhi, maka akan mencetak pesan agar bisa mendapat bonus
        }
    }
    
}
