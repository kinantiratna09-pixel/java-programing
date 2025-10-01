package Kelas_industri;
import javax.swing.JOptionPane;
public class tugas_01 {
    public static void main(String[] args) {
        int panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang: "));
        int lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan lebar: "));

        int hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + hasil);

        
    }
}
