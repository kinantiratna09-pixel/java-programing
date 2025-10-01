package materi_08;
import java.util.Scanner;
// Mengimpor kelas Scanner untuk membaca input dari pengguna

public class tugas_12 {
// Mendefinisikan kelas publik bernama tugas_11

    public static void main(String[] args) {
    // Metode utama, titik awal eksekusi program

        Scanner input = new Scanner(System.in);
        // Membuat objek Scanner untuk membaca input dari keyboard

        System.out.print("Input: ");
        // Menampilkan pesan "Input: " ke layar

        int n = input.nextInt();
        // Membaca input integer dari pengguna dan menyimpannya ke variabel n

        System.out.println("Output: ");
        // Menampilkan pesan "Output: " ke layar

        for (int i = 1; i <= n; i++) {
        // Perulangan luar, dari 1 sampai n (baris)

            for (int j = 1; j <= n; j++) {
            // Perulangan dalam, dari 1 sampai n (kolom)

                if (i == 1 || i == n || j == 1 || j == n || i == j || j == n - (i - 1)) {
                // Jika posisi saat ini adalah pinggir atau diagonal

                    System.out.print("* ");
                    // Cetak bintang dan spasi

                } else {
                    System.out.print(" ");
                    // untuk mencetak spasi 
                }
            }
            System.out.println();
            // Setelah satu baris selesai, pindah ke baris berikutnya
        }
    }
}
