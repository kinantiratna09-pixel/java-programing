package materi_09;

public class tugas_8 {
    public static void main(String[] args) {
        String nama [][] = {
            {"Sugito", "Prayoga"},
            {"Samirul", "Hilmi"},
            {"Leo", "Hermawan"},
            {"Triawan", "Angga"},
        };

        for (int i = 0; i < nama.length; i++) {
            System.out.println(i+1+".");
            for (int j = 0; j < nama[i].length; j++){
                System.out.println(nama [i][j]+ " ");
            }
            
        }
    }
}
