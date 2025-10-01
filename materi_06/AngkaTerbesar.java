package materi_06;
import java.util.Scanner;
// digunakan untuk menginpor kelas Scanner dari paket java.util

public class AngkaTerbesar {
    // mendefinisikan  kelas publik bernama AngkaTerbesar
    public static void main(String[]args) {
        // metode utama yang akan di eksekusi saat program dijalankan
        Scanner input = new Scanner(System.in);
        //Membuat objek Scanner untuk membaca input dari pengguna

        System.out.println("Masukkan angka pertama : ");
        //Meminta user memasukkan angka pertama
        int angka1 = input.nextInt();
        // membaca input dari user untuk menginput angka

        System.out.println("Masukkan angka kedua : ");
        int angka2 = input.nextInt();

        if(angka1 > angka2) {
            //percabangan if untuk mengecek apakah angka1 lebih besar daripad angka2
            System.out.println("Angka pertama : " + angka1 + " lebih besar dari angka kedua : " + angka2);
        } else  {
            // Percabangan else untuk kondisi ketika angka pertama lebih besar dari pada angka kedua
            System.out.println("Angka kedua : " + angka2 + " lebih besar dari angka pertama : " + angka1);
        }
        }
    } 

