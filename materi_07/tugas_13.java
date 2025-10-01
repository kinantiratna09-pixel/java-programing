package materi_07;
import java.util.Scanner;
//digunakan untuk mengimpor kelas Scanner dari paket java.util
public class tugas_13 {
   // mendefinisikan kelas publik bernama tugas_13
    public static void main(String[] args) {
        //metode utama yang akan di eksekusi saat program dijalankan
        Scanner input =new Scanner(System.in);
        //membuat objek Scanner untuk membaca input dari pengguna
        int deret =1;
        //inisialisasi variabel deret dengan nilai 1
        int deretsebelumnya = 1;
        //inisialisasi variabel deretsebelumnya dengan nilai 1
        int Penjumlahan = 0;
        //inisialisasi variabel Penjumlahan dengan nilai 0
        System.out.println(" Jumlah Deret :");
        //meminta user menginputkan jumlah deret
        int Jumlahderet = input.nextInt();
        //membaca input dari user dan menyimpannya dalam variabel Jumlahderet

        int i =1;
        //inisialisasi variabel i dengan nilai 1
        do { 
            //memulai loop do-while yang akan berjalan selama i kurang dari atau sama dengan Jumlahderet
            System.out.println( deret +" ");
            //menampilkan nilai deret saat ini
            deret = deretsebelumnya + Penjumlahan;
            //menghitung nilai deret berikutnya dengan menjumlahkan deretsebelumnya dan Penjumlahan
            Penjumlahan = deretsebelumnya;
            //memperbarui nilai Penjumlahan menjadi deretsebelumnya
            deretsebelumnya = deret;
            //memperbarui nilai deretsebelumnya menjadi deret
            i++;
            //meningkatkan nilai i sebesar 1
        } while (i <= Jumlahderet);
        //mengakhiri loop do-while
    }
}
