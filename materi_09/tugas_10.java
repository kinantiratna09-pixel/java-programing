package materi_09;

public class tugas_10 {
    public static void main(String[] args) {
        String nama[] = {"Kenzo Ismail", "Desmon Daffa", "Kayla Isabela", "Khansa Zakira"};
        int nilai[][] = {
            {80, 90, 62},
            {60, 82, 87},
            {89, 59, 65},
            {77, 75, 60}
        };
        System.out.println("| No. \t| Nama\t\t| Nilai1| Nilai2| Nilai3|");
        for(int i = 0; i<nilai.length; i++) {
            System.out.println("|" +(i+1) +"\t|" + nama[i]+ "\t");
            for (int j = 0; j<nilai[i].length; j ++) {
                System.out.println("|" + nilai[i][j] + "\t");
            }
            System.out.println("|");
            System.out.println();
        }
        int totalNilai;
        System.out.println("\n===== Nilai Rata-Rata =====");
        for(int i = 0; i< nilai.length; i++) {
            totalNilai= 0;
            System.out.println(nama[i] + " : ");
            for(int j=0; j< nilai[i].length; j++) {
                totalNilai += nilai [i][j];
            }
            System.out.println(totalNilai /3);
            
        }
    }
}
