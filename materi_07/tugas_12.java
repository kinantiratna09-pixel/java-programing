package materi_07;
import java.util.Scanner;
// digunakan untuk mengimpor kelas Scanner dari paket java.util
public class tugas_12 {
    // mendefinisikan kelas publik bernama tugas_12
    public static void main(String[] args) {
        // metode utama yang akan di eksekusi saat program dijalankan
        Scanner input = new Scanner(System.in);
        // membuat objek Scanner untuk membaca input dari pengguna
        int menu = 0;
        // mendeklarasikan data tipe integer bernama menu dan menginisialisasi dengan nilai 0
        do{
            // perulangan do-while yang akan terus berjalan selama menu tidak sama dengan 3
            System.out.println("------------------");
            // mencetak garis pemisah
            System.out.println("Menu : \n1. Penjumlahan \n2. Pengurangan \n3. Keluar");
            // mencetak menu pilihan
            System.out.println("Masukkan menu pilihan anda : ");
            // meminta user menginput menu pilihan
            menu = input.nextInt();
            // menyimpan input dari user ke dalam variabel menu
            switch(menu){
                // struktur kontrol switch untuk mengeksekusi blok kode berdasarkan nilai menu
                case 1:
                // jika menu bernilai 1 maka blok kode berikut akan dieksekusi
                    System.out.println("Anda memilih menu penjumlahan");
                    //Mencetak pesan bahwa user memilih menu penjumlahan
                    break;
                    // menghentikan eksekusi switch
                case 2:
                // jika menu bernilai 2 maka blok kode berikut akan dieksekusi
                    System.out.println("MAnda memilih menu pengurangan ");
                    //Mencetak pesan bahwa user memilih menu pengurangan
                    break;
                    //Menghentikan eksekusi switch
                case 3:
                // jika menu bernilai 3 maka blok kode berikut akan dieksekusi
                    System.out.println("Program berhenti");
                    //Mencetak pesan bahwa program berhenti
                    break;
                    //Menghentikan eksekusi switch

            }
            System.out.println("\n");
            // mencetak baris baru untuk pemisah antar iterasi
        }while (menu !=3);
        // mengakhiri perulangan do-while
    }
}
