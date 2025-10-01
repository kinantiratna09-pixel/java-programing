package materi_08;
import java.util.Scanner;
// digunakan untuk mengimpor kelas Scanner dari paket java.util
public class tugas_2 {
    // mendefinisikan kelas publik bernama tugas_2
        public static void main(String[] args) {
            // metode utama yang akan di eksekusi saat program dijalankan
       Scanner input = new Scanner(System.in);
       // membuat objek Scanner untuk membaca input dari pengguna

    while (true) {
        // memulai loop while yang akan berjalan terus menerus
        System.out.println("Ketikkan Angka Berapapun (Kecuali 0): ");
        // meminta user menginputkan angka berapapun kecuali 0
        int angka = input.nextInt();
        // membaca input dari user dan menyimpannya dalam variabel angka

        if (angka ==0) {
            // memeriksa apakah angka yang diinputkan sama dengan 0
            break;
            // menghentikan loop jika angka sama dengan 0
        }
    }
    }
}
