package materi_06;
import javax.swing.JOptionPane;
public class KonveriPlatKendaraan {
    public static void main(String[] args) {
        String platnomor =JOptionPane.showInputDialog("Inputkan Kode Plat Nomor Kendaraan ");

        switch (platnomor) {
            case "P":
                System.out.println("Jmber, Banyuwangi, Bondowoso, Situbondo");
                break;
            case "N":
                System.out.println("Lumajang, Probilinggo, Pasuruan, Malang");
                break;
            case "L":
                System.out.println("Surabaya");
                break;
            default:
                System.out.println("Yang Anda Inputkan Tidak Tersedia Dalam Data Kami");
        }
    }
}
