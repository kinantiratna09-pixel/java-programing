package materi_09;
import java.util.Scanner;
public class tugas_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inputkan Jumlah Angka: ");
        int n = input.nextInt();

        int angka[] = new int[n];

        for (int i = 0; i < angka.length; i++) {
            System.out.println("Inputkan Angka Ke-" + (i+1) + " = ");
            angka[i] = input.nextInt();
        }
        int total = 0;
        for (int i = 0; i<angka.length; i++) {
            total = total + angka [i];
        }
        System.out.println("/nMaka Total Angkanya Adalah: " + total);
    }
}
