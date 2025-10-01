package materi_06;
import java.util.Scanner;
//untuk memanggil kels berdasarkan java util Scanner

public class ProgramPengelolahAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1=0, angka2=0;

        System.out.print("Pilihan Menu: ");
        System.out.print("\n1. Menentukan Angka Terbesar");
        System.out.print("\n2. Menentukan Angka Ganjil Dan Genap");
        System.out.print("\n3. Masukkan Pilihan Anda: ");
        int pilihanmenu = input.nextInt();

        switch (pilihanmenu) {
            case 1:
                System.out.print("Masukkan Angka Pertama: ");
                angka1 = input.nextInt();

                System.out.print("Masukkan Angka Kedua: ");
                angka2 = input.nextInt();

                if(angka1 > angka2) {
                    System.out.println("Angka pertama : " + angka1 + " lebih besar dari angka kedua : " + angka2);
                } else  {
                    System.out.println("Angka kedua : " + angka2 + " lebih besar dari angka pertama : " + angka1);
                }
                break;
            case 2:
                System.out.print("Masukkan Angka Pertama: ");
                angka1 = input.nextInt();

                System.out.print("Masukkan Angka Kedua: ");
                angka2 = input.nextInt();

                if(angka1 % 2 == 0) {
                    System.out.println("Angka Pertama:"+ angka1 +" adalah bilangan genap");
                } else {
                    System.out.println("Angka Pertama :" + angka1 + " adalah bilangan ganjil");
                }
                if(angka2 % 2 == 0) {
                    System.out.println("Angka Kedua:"+ angka2 +" adalah bilangan genap");
                } else {
                    System.out.println("Angka Kedua :" + angka2 + " adalah bilangan ganjil");
                }
                break;
            default:
                System.out.println("Pilihan Anda Tidak Tersedia");
        }
    }
}
        