package materi_07;
import java.util.Scanner;
// digunakan untuk mengimpor kelas Scanner dari paket java.util
public class tugas_10 {
    // mendefinisikan kelas publik bernama tugas_10
    public static void main(String[] args) {
        // metode utama yang akan di eksekusi saat program dijalankan
        Scanner input = new Scanner(System.in);
        // membuat objek Scanner untuk membaca input dari pengguna
        String jawabanUser ="";
        // mendeklarasikan data tipe string bernama jawaban User dan menginisialisasi dengan string kosong

        while (!jawabanUser.equalsIgnoreCase("ya")) {
            // perulangan while yang akan terus berjalan selama jawaban User tidak sama dengan "ya" (tidak peka huruf besar/kecil)
            System.out.print("Apakah Anda Yakin Ingin Keluar? Jawab (ya/Tidak) : ");
            // meminta user menginput jawaban apakah ingin keluar atau tidak
            jawabanUser = input.nextLine();
            // menyimpan input dari user ke dalam variabel jawaban User
            
        }
    }
}
