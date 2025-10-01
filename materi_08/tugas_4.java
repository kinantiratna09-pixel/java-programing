package materi_08;
public class tugas_4 {
    // mendefinisikan kelas publik bernama tugas_4

    public static void main(String[] args) {
        // metode utama yang akan di eksekusi saat program dijalankan
        for(int i = 1; i <= 20; i++){
            // memulai loop for yang akan berjalan selama i kurang dari atau sama dengan 20, dengan i dimulai dari 1 dan
            // bertambah 1 setiap iterasi
            if(i%2!=0){
                // memastikan hanya bilangan genap yang dicetak oleh program
                continue; 
                // melewati iterasi saat ini jika i adalah bilangan ganjil
            }
                System.out.print(i + "\t"); 
                //mencetak nilai i dang /t sebagai pemisahnya
            }
        }
    }