package materi_08;
// Menyatakan file ini berada di package 'materi_08'
import java.util.Scanner;
// Mengimpor kelas Scanner untuk input dari pengguna
public class tugas_12_cara2 {
// Mendefinisikan kelas publik bernama tugas_12_cara2

    public static void main(String[] args) {
    // Metode utama, titik awal eksekusi program

        Scanner input = new Scanner(System.in);
        // Membuat objek Scanner untuk membaca input dari keyboard

        System.out.println("Input :");
        // Menampilkan pesan "Input :" ke layar

        int n = input.nextInt();
        // Membaca input integer dari pengguna dan menyimpannya ke variabel n

        System.out.println("Output : ");
        // Menampilkan pesan "Output :" ke layar

        for (int i = 1; i <= n; i++) {
        // Perulangan luar, dari 1 sampai n (baris)

            for (int j = 1; j <= n; j++) {
            // Perulangan dalam, dari 1 sampai n (kolom)

                if (i == 1 || i == n || j == 1 || j == n || i == j || j + i == n + 1) {
                // Jika posisi saat ini adalah pinggir (baris/kolom pertama/terakhir), diagonal utama (i==j), atau diagonal kedua (j+i==n+1)

                    System.out.println("* ");
                    // Mencetak bintang dan langsung pindah baris (seharusnya System.out.print agar bintang sejajar)

                } else {
                    System.out.println(" ");
                    // Jika bukan pinggir/diagonal, cetak spasi dan langsung pindah baris (seharusnya System.out.print)
                }
            }
            System.out.println();
            // Setelah satu baris selesai, pindah ke baris berikutnya
        }
    }
}