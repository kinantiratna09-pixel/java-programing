package materi_08;

public class tugas_3 {
    // mendefinisikan kelas publik bernama tugas_3
    public static void main(String[] args) {
        // metode utama yang akan di eksekusi saat program dijalankan
        int deret =1;
        //  inisialisasi variabel deret dengan nilai 1
        int deretsebelumnya =1;
        // inisialisasi variabel deretsebelumnya dengan nilai 1
        int penjumlahan =0;
        // inisialisasi variabel penjumlahan dengan nilai 0

        while (true) {
            // memulai loop while yang akan berjalan terus menerus
            System.out.print(deret + " ");
            // menampilkan nilai deret saat ini
            deret = deretsebelumnya + penjumlahan;
            // menghitung nilai deret berikutnya dengan menjumlahkan deretsebelumnya dan penjumlahan
            penjumlahan = deretsebelumnya;
            // memperbarui nilai penjumlahan menjadi deretsebelumnya
            deretsebelumnya = deret;
            // memperbarui nilai deretsebelumnya menjadi deret
            if (deret >= 200) {
                // memeriksa apakah deret lebih besar dari atau sama dengan 200
                break;
                // menghentikan loop jika deret lebih besar dari atau sama dengan 200
            }
        }
    }
    
}
