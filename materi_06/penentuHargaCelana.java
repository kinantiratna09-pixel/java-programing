package materi_06;
import java.io.*;
// Digunakan untuk mengimpor kelas BufferedReader dan InputStreamReader dari paket java.io

public class penentuHargaCelana {
    // Mendefinisikan kelas publik bernama penentuHargaCelana
    public static void main(String[] args) throws IOException {
        // Metode utama yang akan di eksekusi saat program dijalankan
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // Membuat objek BufferedReader untuk membaca input dari pengguna

        System.out.println("Merknya apa? : ");
        //Meminta user untuk menginput merk celana
        String merk = input.readLine();
        //Membaca input dari user dan menyimpannya dalam variabel merk

        int ukuran = 0;
        // Mendeklarasikan variabel integer bernama ukuran
        int Harga = 0;
        // Mendeklarasikan variabel integer bernama Harga

        if (merk.equals("ABC")) {
            //Memeriksa apakah merk yang diinputkan adalah "ABC"
            System.out.print("Ukurannya apa? :" );
            //Meminta user untuk menginput ukuran celana
            ukuran = Integer.parseInt(input.readLine());
            //Membaca input dari user, mengonversinya ke integer, dan menyimpannya dalam variabel ukuran

            if (ukuran >= 26 && ukuran <= 30) {
                //Jika ukuran antara 26 hingga 30, maka Harga adalah 160000
                Harga = 160000;
                //Percabangan if untuk mengecek rentang ukuran dan menentukan harga
            } else if (ukuran >= 31 && ukuran <= 34) {
                //Jika ukuran antara 31 hingga 34, maka Harga adalah 180000
                Harga = 180000;
                //Percabangan else if untuk mengecek rentang ukuran dan menentukan harga
            }

            System.out.println("Merk: " + merk);
            // Mencetak merk celana
            System.out.println("Ukuran: " + ukuran);
            // Mencetak ukuran celana
            System.out.println("Harga: Rp. " + Harga);
            // Mencetak harga celana
        }else if (merk.equals("DEF")) {
            //Memeriksa apakah merk yang diinputkan adalah "DEF"
            System.out.print("Ukurannya apa? :" );
            //Meminta user untuk menginput ukuran celana


            if (ukuran >= 26 && ukuran <= 30) {
                //Jika ukuran antara 26 hingga 30, maka Harga adalah 210000
                Harga = 210000;
                //Percabangan if untuk mengecek rentang ukuran dan menentukan harga
            } else if (ukuran >= 31 && ukuran <= 34) {
                //Jika ukuran antara 31 hingga 34, maka Harga adalah 220000
                Harga = 220000;
                //Percabangan else if untuk mengecek rentang ukuran dan menentukan harga
            }

            System.out.println("Merk: " + merk);
            // Mencetak merk celana
            System.out.println("Ukuran: " + ukuran);
            // Mencetak ukuran celana
            System.out.println("Harga: Rp. " + Harga);
            // Mencetak harga celana
        } else {
            //Percabangan else untuk kondisi ketika user memiih produk yang tidak ada
            System.out.println("Maaf, merk yang anda masukkan tidak tersedia");
            // memunculkan teks jika merk yang dicari oleh user tidak ada
        }
    }
}