package materi_06;
import java.util.Scanner;
// Digunakan untuk mengimpor kelas Scanner dari paket java.util

public class konversinilai_1 {
// Mendefinisikan kelas publik bernama konversinilai_1
    public static void main(String[] args) {
        // Metode utama yang akan di eksekusi saat program dijalankan
        Scanner input = new Scanner(System.in);
        // Membuat objek Scanner untuk membaca input dari pengguna

        System.out.print("Inputkan score angka : ");
        //Meminta user untuk menginput score angka
        int score = input.nextInt();
        //Membaca input dari user dan menyimpannya dalam variabel score
        String nilaihuruf;
        // Mendeklarasikan variabel string bernama nilaihuruf

        if(score >= 80 && score <=100) {
            //Percabangan if untuk mengecek rentang score dan menentukan nilai huruf
            nilaihuruf = "A";
                //Jika score antara 80 hingga 100, maka nilai huruf adalah A
        } else if(score >= 71 && score <= 80) {
            //jika score antara 71 hingga 80, maka nilai huruf adalah B
            nilaihuruf = "B";
            //Percabangan else if untuk mengecek rentang score dan menentukan nilai huruf
        } else if(score >= 51 && score <= 70) {
            //jika score antara 51 hingga 70, maka nilai huruf adalah C
            nilaihuruf = "C";
            //Percabangan else if untuk mengecek rentang score dan menentukan nilai huruf
        } else if(score >= 21 && score <= 50) {
            //Percabangan else if untuk mengecek rentang score dan menentukan nilai huruf
            nilaihuruf = "D";
            //jika score antara 21 hingga 50, maka nilai huruf adalah D 

        } else  {
            //Jika score kurang dari 21, maka nilai huruf adalah E
            nilaihuruf = "E";
            //Percabangan else untuk kondisi ketika score kurang dari 21
        }
        System.out.println("Nilainya adalah " + nilaihuruf);
        //Mencetak nilai huruf berdasarkan score yang diinputkan user
    }
    
}
