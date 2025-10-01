package materi_09;
import java.io.*;
public class tugas_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] laptop = new String[3];
        String [] handphone = new String[3];

        for (int i = 0; i < laptop.length; i++) {
            System.out.println("Msukkan Nama Merk Laptop: ");
            laptop[i] = br.readLine();
        }
        for (int i = 0; i < handphone.length; i++){
            System.out.println("Masukkan Nama Merk Handphone: ");
            handphone[i] = br.readLine();
        }
        System.out.println("\n-------- Data Laptop --------");
        for (int i = 0; i < laptop.length; i++) {
            System.out.println((i+1) + "." + laptop[i]);
        }
        System.out.println("\n-------- Data Handphone --------");
        for (int i = 0; i < handphone.length; i++) {
            System.out.println((i+1) + "." + handphone[i]);
        }

    }
    
}
