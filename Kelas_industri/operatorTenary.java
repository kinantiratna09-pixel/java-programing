package Kelas_industri;
import java.util.Scanner;
public class operatorTenary {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("PT.HummahTech.");
System.out.println("------------");
System.out.print("Apakah anda bersedia bekerja di perusahaan ini?: ");
String a = input.next();
System.out.print("Apakah anda mempunyai pengalaman terkait pekerjaan ini?: ");
String b = input.next();
System.out.print("Apakah anda bersedia menanggung resiko pada pekerjaan ini? : ");
String c = input.next();
String hasil;
hasil = a.equals( "ya") && b.equals( "ya") && c.equals("ya") ? "Selamat kamu diterima....:)" : "Semangat jangan menyerah!";
System.out.println(hasil);
}
}