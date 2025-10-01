package materi_06;
import java.util.Scanner;
// digunakan untuk mengimpor  kelas Scanner dari paket java.util
public class AngkaGanjilGenap {
    // mendefinisikan kels publik bernama AngkaGanjilGenap
    public static void main(String[] args) {
        // Metode utama yang akan di eksekusi saat program dijlankan
        Scanner input = new Scanner(System.in);
        // membuat objek Scanner untuk membaca input dari pengguna

        System.out.print("Masukkan Angka Pertama: ");
        // Meminta user menginput angka pertama 
        int angka1 = input.nextInt();
        // mendeklarasikan data tipe integer bernamma angka1

        System.out.print("Masukkan Angka Kedua: ");
        int angka2 = input.nextInt();

        if(angka1 % 2 == 0) {
            //
            System.out.println("Angka Pertama:"+ angka1 +" adalah bilangan genap");
        } else {
            System.out.println("Angka Pertama :" + angka1 + " adalah bilangan ganjil");
        }
        if(angka2 % 2 == 0) {
            System.out.println("Angka Kedua:"+ angka2 +" adalah bilangan genap");
        } else {
            System.out.println("Angka Kedua :" + angka2 + " adalah bilangan ganjil");
        }
    }
}
