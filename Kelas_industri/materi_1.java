package Kelas_industri;
import java.util.Scanner;
public class materi_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan Nama Lengkap: ");
        String nama = input.nextLine();

        System.out.print("Inputkan usia: ");
        int usia = input.nextInt();

        System.out.print("Inputkan Kota Asal: ");
        String kota = input.next();

        System.out.print("Inputkan Tinggi: ");
        double tinggi = input.nextDouble();

        System.out.print("============ OUTPUT ==========");
        System.out.print("Nama Lengkap = " + nama);
        System.out.print("Usia = " + usia + " tahun"); 
        System.out.print(" Kota Asal = " + kota);
        System.out.print("Tinggi = " + tinggi );
    }
} 