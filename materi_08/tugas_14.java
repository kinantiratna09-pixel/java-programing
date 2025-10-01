package materi_08;
// Menyatakan file ini berada di package 'materi_08'h
import java.util.Scanner;
// Mengimpor kelas Scanner untuk input dari pengguna

public class tugas_14 {
// Mendefinisikan kelas publik bernama tugas_14

    public static void main(String[] args) {
    // Metode utama, titik awal eksekusi program

        Scanner input = new Scanner(System.in);
        // Membuat objek Scanner untuk membaca input dari keyboard

        System.out.println("Tinggi piramida: ");
        // Menampilkan pesan "Tinggi piramida: " ke layar

        int tinggi = input.nextInt();
        // Membaca input integer dari pengguna dan menyimpannya ke variabel tinggi

        System.out.println("Output : ");
        // Menampilkan pesan "Output : " ke layar

        for (int i = 1 ; i <= tinggi ; i++) {
        // Perulangan luar, dari 1 sampai tinggi (baris piramida)

            for (int j = i ; j <= tinggi + 1; j ++){
            // Perulangan untuk mencetak spasi di awal setiap baris
                System.out.print(" "); // Perbaikan: gunakan print, bukan println
            }

            for (int k = 5; k >= (i * 2) -5; k-- ){
            // Perulangan untuk mencetak bintang di setiap baris
                System.out.print("*"); // Perbaikan: gunakan print, bukan println
            }

            System.out.println();
            // Setelah satu baris selesai, pindah ke baris berikutnya
        }
    }
}