package materi_09;
import java.util.Scanner;
public class tugas_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Inputkan Jumlah Data: ");
        int n = input.nextInt();

        String nama[] = new String[n];
        int nilai [][]= new int [n][3];

        for(int i = 0; i< nilai.length; i++){
            System.out.println("Inputkan Nama Ke-" + (i +1) +": ");
            nama[i] = input.next();
        }
        System.out.println();
        for(int i =0; i<nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("Inputkan Nilai" + (j + 1) + " " + nama[i] + ": ");
                nilai[i][j] = input.nextInt();
            }
        }
        System.out.println("\n===== Nilai Rata-Rata Siswa =====");
        int totalNilai, ratarataNilai;
        for(int i=0; i< nilai.length; i++ ) {
            totalNilai = 0;
            System.out.println(nama [i] + " : ");
            for(int j = 0; j< nilai[i].length; j++) {
            totalNilai+= nilai [i][j];
        }
        ratarataNilai = totalNilai / nilai[i].length;
        if(ratarataNilai >= 81 && ratarataNilai <= 100) {
            System.out.println(ratarataNilai + "--> Nilai A");
        }else if (ratarataNilai >= 71 && ratarataNilai <= 80 ) {
            System.out.println(ratarataNilai+ "--> Nilai B");
        } else if (ratarataNilai>=51 && ratarataNilai <= 70);{ 
            System.out.println(ratarataNilai + " --> Nilai C");
        }else if ( ratarataNilai >=31 && ratarataNilai <= 50) {
            System.out.println();
        }
    }
    
}
