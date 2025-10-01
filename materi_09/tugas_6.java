package materi_09;
import java.util.Scanner;
public class tugas_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inputkan Jumah Angka : ");
        int n = input.nextInt();

        int angka[] = new int [n];
    
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Inputkan Angka Ke-" + ( i + 1) + "=");
            angka[i] = input.nextInt();
        }
        int max = angka[0];
        for(int i = 0; i< angka.length; i++ ){
            if (angka[i]> max ) {
                max = angka [i];
            }
        }
        System.out.println("\nMaka Angka Terbesar Adalah : " + max);
        
    }
}
