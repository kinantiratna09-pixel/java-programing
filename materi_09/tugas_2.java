package materi_09;

import javax.swing.JOptionPane;

public class tugas_2 {
    public static void main(String[] args) {
        String namaSiswa[] = new String[5];

        for (int i = 0; i < namaSiswa.length; i++) {
            namaSiswa[i] = JOptionPane.showInputDialog("Masukkan nama teman anda");
        }
        for (int i = 0; i < namaSiswa.length; i++) {
            System.out.println((i+1) + namaSiswa[i]);
            
        }
    }
}