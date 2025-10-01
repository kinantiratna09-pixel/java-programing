package materi_08;
public class tugas_1 {
    // mendefinisikan kelas publik bernama tugas_1
    public static void main(String[] args) {
        // metode utama yang akan di eksekusi saat program dijalankan   
        for (int i = 1; i > 0; i++) {
            // memulai loop for yang akan berjalan selama i lebih besar dari 0, dengan i dimulai dari 1 dan bertambah 1 setiap iterasi
            if (i == 11) {
                // memeriksa apakah i sama dengan 11
                break;
                // menghentikan loop jika i sama dengan 11
            }
            System.out.println(i + "\t");
            // mencetak nilai i diikuti dengan tab
        } 
    }
}
