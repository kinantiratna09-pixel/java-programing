package materi_08;
import java.util.Scanner;
public class jjjj {
    public static void main(String[] args) {
    // Metode utama, titik awal eksekusi program

        Scanner input = new Scanner(System.in);
        // Membuat objek Scanner untuk membaca input dari keyboard

        System.out.print("Input: ");
        // Menampilkan pesan "Input: " ke layar

        int n = input.nextInt();
        // Membaca input integer dari pengguna dan menyimpannya ke variabel n

        System.out.println("Output : ");
        // Menampilkan pesan "Output : " ke layar

        for (int i = 1; i <= n; i++) {
        // Perulangan luar, dari 1 sampai n (baris)

            for (int j = 5; j >= i; j--) {
            // Perulangan dalam, dari 1 sampai i (kolom), jumlah bintang sesuai nomor baris

                System.out.print("* ");
                // Mencetak bintang dan langsung pindah baris (seharusnya System.out.print agar bintang sejajar)

            }
            System.out.println();
            // Setelah satu baris selesai, pindah ke baris berikutnya
        }
    }
}
