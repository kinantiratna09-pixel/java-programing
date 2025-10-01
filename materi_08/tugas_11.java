package materi_08;
// Menyatakan file ini berada di package 'materi_08'
public class tugas_11 {
    // Mendefinisikan kelas publik bernama tugas_11
    public static void main(String[] args) {
        //Metode utama, titik awal eksekusi program
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Membuat objek Scanner untuk membaca input dari keyboard

        System.out.print("Input :");
        // Menampilkan pesan "Input :" ke layar

        int n = input.nextInt();
        // Membaca input integer dari pengguna dan menyimpannya ke variabel n

        System.out.println("Output :");
        // Menampilkan pesan "Output :" ke layar

        for (int i=1; i <= n ; i++) {
        // Perulangan luar, dari 1 sampai n (baris)

            for (int j=1; j <= n; j++) {
            // Perulangan dalam, dari 1 sampai n (kolom)

                if (i == 1 || i==n || j == 1 ||j== n || i == j ){
                // Jika di pinggir (baris/kolom pertama/terakhir) atau diagonal utama (i==j)

                    System.out.print("*");
                    // Cetak bintang

                } else {
                    System.out.print(" ");
                    // Jika di dalam (bukan pinggir/diagonal), cetak spasi
                }
            }
            System.out.println();
            // Setelah satu baris selesai, pindah ke baris berikutnya
        }
        
    }
}