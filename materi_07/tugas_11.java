package materi_07;
import java.util.Scanner;
// digunakan untuk mengimpor kelas Scanner dari paket java.util
public class tugas_11 {
    //  mendefinisikan kelas publik bernama tugas_11
    public static void main(String[] args) {
        // metode utama yang akan di eksekusi saat program dijalankan
        Scanner input = new Scanner(System.in);
        // membuat objek Scanner untuk membaca input dari pengguna
        String ganjil = "";
        // mendeklarasikan data tipe string bernama ganjil dan menginisialisasi dengan string kosong
        String genap ="";
        // mendeklarasikan data tipe string bernama genap dan menginisialisasi dengan string kosong

        System.out.println("Inputkan Panjang Deret");
        // meminta user menginput panjang deret
        int deret = input.nextInt();
        // mendeklarasikan data tipe integer bernama deret untuk menyimpan input dari user

        int i =1;
        // mendeklarasikan data tipe integer bernama i dan menginisialisasi dengan nilai 1
        do { 
            // perulangan do-while untuk memisahkan bilangan ganjil dan genap dari 1 sampai deret
            if (i% 2 == 1) {
                // kondisi if untuk mengecek apakah i adalah bilangan ganjil
                ganjil = ganjil + i + " ";
                // menambahkan i ke string ganjil diikuti dengan spasi
            } else{
                // jika i bukan bilangan ganjil maka i adalah bilangan genap
                genap = genap + i + " ";
                // menambahkan i ke string genap diikuti dengan spasi
            }
            i++;
            // menambahkan i setiap iterasi
        } while (i <= deret);
        // perulangan do-while akan terus berjalan selama i kurang dari atau sama dengan deret

        System.out.println("Bilangan Ganjil :" + ganjil);
        // mencetak string ganjil
        System.out.println("Biangan Genap: " + genap);
        //  mencetak string genap
    }
}
