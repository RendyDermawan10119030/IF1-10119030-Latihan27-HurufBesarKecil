package if1.pkg10119030.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program : Program ini menampilkan penggantian gaya penulisan huruf.
*/
public class hurufBesarKecil {
    static Scanner scan = new Scanner(System.in);
    
    private static String masukkanKalimat(){
        System.out.print("Masukkan Kalimat : ");
        return scan.nextLine();
    }
    
    private static void tampilKalimat(String kalimat){
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf besar : ".concat(kalimat.toUpperCase()));
        System.out.println("Huruf kecil : ".concat(kalimat.toLowerCase()));
    }
public static void main(String[] args){
        tampilKalimat(masukkanKalimat());
        System.out.println("(Developed by : Rendy Dermawan)");
    }
}