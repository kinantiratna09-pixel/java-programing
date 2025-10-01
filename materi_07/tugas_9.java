package materi_07;
import java.util.Scanner;
// digunakan untuk mengimpor kelas Scanner dari paket java.util
public class tugas_9 {
    //  mendefinisikan kelas publik bernama tugas_9
    public static void main(String[] args) {
        // metode utama yang akan di eksekusi saat program dijalankan
        Scanner input = new Scanner(System.in);
        // membuat objek Scanner untuk membaca input dari pengguna
        int hasil = 1;
        // mendeklarasikan data tipe integer bernama hasil dan menginisialisasi dengan nilai 1

        System.out.print("Nilai: ");
        // meminta user menginput nilai
        int nilai = input.nextInt();
        // mendeklarasikan data tipe integer bernama nilai untuk menyimpan input dari user

        while (nilai >= 1) {
            // perulangan while untuk menghitung faktorial dari nilai yang diinputkan oleh user
            hasil *= hasil;
            // mengalikan hasil dengan nilai setiap iterasi
            nilai--;
            // mengurangi nilai setiap iterasi
        }
        System.out.println("Faktorial: " + hasil);
        // mencetak hasil faktorial
    }
    
}
