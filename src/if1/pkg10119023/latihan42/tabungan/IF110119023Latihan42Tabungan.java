/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan42.tabungan;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : proggram penarikan uang
 *
 */
import java.util.Scanner;
public class IF110119023Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=====Program Penarikan Uang=====");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan t = new Tabungan(scan.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        int diambil = scan.nextInt();
        int sisa = t.ambilUang(diambil);
        System.out.println("Saldo Anda Sekarang : "+sisa);
    }

}
