package materi_08;

public class tugas_7 {
// Mendefinisikan kelas publik bernama tugas_7

    //me (komentar, tidak berpengaruh pada program)

    public static void main(String[] args) {
    // Metode utama, titik awal eksekusi program

        for (int i=1; i <=5; i++ ) {
        // Perulangan luar, i dari 1 sampai 5

            for (int j =1; j<=5; j++) {
            // Perulangan dalam, j dari 1 sampai 5

                System.out.println(i + "\t");
                // Mencetak nilai i diikuti tab, lalu pindah baris (karena println)

            }

            System.out.println();
            // Mencetak baris kosong setelah satu iterasi perulangan luar

        }

    }

}