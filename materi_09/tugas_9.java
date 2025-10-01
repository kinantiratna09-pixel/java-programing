package materi_09;

public class tugas_9 {
    public static void main(String[] args) {
        int [][] angka = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10 },
            {11, 12, 13, 14,}
        };
        int total;

        for (int i = 0; i<angka.length; i++) {
            total = 0;
            System.out.println("Total Penjumlahn : ");
            for (int j = 0; j < angka[i].length; j++) {
                System.out.println(angka [i][j] + " ");
                total = total + angka [i][j];
                }
                System.out.println("= " + total );
                System.out.println();
            }
        }
    }