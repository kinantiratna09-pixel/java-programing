package Kelas_industri;
 import java.util.Scanner;
public class tugas03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PT.HummahTech.");
        System.out.println("----------------");
        System.out.print("Apakah anda bersedia bekerja di perusahaan ini?: ");
        String a = input.next();
        System.out.print("Apakah anda mempunyai pengalaman terkait pekerjaan ini?: ");
        String b = input.next();
        System.out.print("Apakah anda bersedia menanggung resiko pada pekerjaan ini? : ");
        String c = input.next();
        String hasil;
        
        if (a != "ya" && b != "ya" && c != "ya" ) {
            System.out.println("Selamat anda diterima di perushaan ini");
        } else {
            System.out.println(" Maaf anda tidak di terima di perusahaan ini");
        }


    }
    
}
