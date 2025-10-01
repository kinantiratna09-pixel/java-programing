package materi_12;
import java.util.Scanner;
public class RekursifPangkat {
    public static int hitungPangkat(int x, int y){
        if (y == 0) {
            return 1;
        }else {
            return x * hitungPangkat(x,y -1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inputkan angka yang akan dipngkatkan (x)");
    }
}
