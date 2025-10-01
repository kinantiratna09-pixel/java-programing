package materi_06;
import  java.util.Scanner;
// Digunakan untuk mengimpor kelas Scanner dari paket java.util

public class KonversiBulanKe {
    //Mendefisnisikan kelas publik bernama KonversiBulanKe
    public static void main(String[] args) {
        //Metode utama yang akan di eksekusi saat program dijalankan  
        Scanner input = new Scanner(System.in);
        // Membuat objek Scanner untuk membaca imput dari pengguna 

        System.out.print("Masukkan angka hari : ");
        // meminta user menginput angka hari
        int angkaHari = input.nextInt();
        //Membaca input dari user dan menyiapkan dalam variable angka hari

        switch (angkaHari) {
            //Percabangan switch (berfungsi sebagai alternatif yang jauh lebih ringkas dan terstruktur)
            //untuk mengecek nilai dari variable angkahari
            case 1:
            //jika nilai angka hari adalah satu maka akan mengeksekusi perintah yang ada didalam System.out.println
                System.out.println("Hari Minggu");
                //mencetak teks "hari minggu" jika user menginput angka 1
                break;
                //berfungsi untuk menghentikan eksekusi setelah menemukan kecocokan pada salah satu case
            case 2:
                System.out.println("Hari Senin");
                break;
            case 3:
                System.out.println("Hari Selsa");
                break;
            case 4:
            System.err.println("Hari Rabu");
                break;
            case 5:
                System.out.println("Hari Kamis");
                break;
            case 6:
                System.out.println("Hari Jum'at");
                break;
            case 7:
                System.out.println(" Hari Sabtu");
                break;
            default:
            //deatfult berfungsi untuk menangani kasus dimana nilai angka hari tidak ssuai dengan case yang tidak ada
            //jika nilai angkahari tidak sesuai dengan case yang ada maka akan mengekekusi perintah yang ada didalam system.out.println 
            System.out.println("Angka Yang Anda Inputkan Tidak Tersedia ");
            // teks akan dimunculkan jika user menginputkan case yang tidak tersedia  
    }
    }
}        