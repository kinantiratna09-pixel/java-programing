package materi_07;
import java.util.Scanner;
// digunakan untuk mengimpor kelas Scanner dari paket java.util
public class tugas_7 {
    // mendefinisikan kelas publik bernama tugas_7
    public static void main(String[] args) {
        // metode utama yang akan di eksekusi saat program dijalankan
        Scanner input=new Scanner(System.in);
        // membuat objek Scanner untuk membaca input dari pengguna
        int penambahan =2;
        // mendeklarasikan data tipe integer bernama penambahan dan menginisialisasi dengan nilai 2
        int nilai =3;
        // mendeklarasikan data tipe integer bernama penambahan dan nilai

        System.out.print("Masukkan jumlah deret: ");
        // meminta user menginput jumlah deret
        int Jumlahderet = input.nextInt();
        // mendeklarasikan data tipe integer bernama Jumlahderet untuk menyimpan input dari user

        for (int i = 1; i <= Jumlahderet; i++) {
            // perulangan for untuk mencetak deret sesuai dengan input dari user
            System.out.println(nilai +"\t");
            // mencetak nilai diikuti dengan tab
            nilai += penambahan;
            // menambahkan nilai dengan penambahan setiap iterasi
            penambahan++;
            // menambahkan penambahan setiap iterasi
        }
    }
    
}
