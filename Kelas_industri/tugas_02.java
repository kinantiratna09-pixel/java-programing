package Kelas_industri;
import java.io.*;

public class tugas_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Inputkan Nama Sekolah: ");
            String nama = input.readLine();

            System.out.print("Inputkan Jarak rumah Kesekolah: ");
            int jarak = Integer.parseInt(input.readLine());

            System.out.print("Inputkan kode plat nomor: ");
            char plat = (char) input.read();
            System.out.print("Inputkan anak keberapa: ");
            double anak = Double.parseDouble(input.readLine());

            System.out.print("============ OUTPUT ==========");
            System.out.print("Nama Sekolah = " + nama);
            System.out.print("Jarak rumah Kesekolah = " + jarak + " km");
            System.out.print(" kode plat nomor = " + plat);
            System.out.print("anak keberapa = " + anak );
    }
}   