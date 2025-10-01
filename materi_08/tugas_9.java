package materi_08;
// Menyatakan file ini berada di package 'materi_08'
import java.util.Scanner;
// Mengimpor kelas Scanner untuk input dari pengguna
public class tugas_9 {
// Mendefinisikan kelas publik bernama tugas_9

    public static void main(String[] args) {
    // Metode utama, titik awal eksekusi program

        Scanner input = new Scanner(System.in);
        // Membuat objek Scanner untuk membaca input dari keyboard

        System.out.println("Input :");
        // Menampilkan pesan "Input :" ke layar

        int n = input.nextInt();
        // Membaca input integer dari pengguna dan menyimpannya ke variabel n

        System.out.println("Output :");
        // Menampilkan pesan "Output :" ke layar

        for (int i=1; i <= n ; i++) {
        // Perulangan luar, dari 1 sampai n (baris)

            for (int j=1; j <= n; j++) {
            // Perulangan dalam, dari 1 sampai n (kolom)

                System.out.print("*");
                // Mencetak karakter '*' tanpa pindah baris

            }
            System.out.println();
            // Setelah satu baris selesai, pindah ke baris berikutnya

        }
        
    }
    
}