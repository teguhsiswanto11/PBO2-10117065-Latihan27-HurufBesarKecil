package pbo2.pkg10117065.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : Mengkonversi kalimat menjadi format huruf kapital semua 
 * dan menjadi format huruf kecil semua dari input kalimat yang kita masukkan
 * 
 */
public class PBO210117065Latihan27HurufBesarKecil {

    public static void main(String[] args) {
        
//        deklarasi variabel
        String kalimat;
        String hBesar;
        String hKecil;
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = scn.nextLine(); // nextLine -> untuk input lebih dari 1 kata
        
        hBesar = kalimat.toUpperCase(); //ke format Kapital
        hKecil = kalimat.toLowerCase(); //ke format kecil
        
//        menampilkan hasil
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Huruf Besar : "+ hBesar);
        System.out.println("Huruf Kecil : "+ hKecil);
        
    }
    
}
