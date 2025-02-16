/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kharismaplaza;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class KharismaPlaza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int total = 0;
        
        // Print header
        System.out.println("------------------------------------------------");
        System.out.println("           Kharisma Agung Plaza < KAP >         ");
        System.out.println("            Promo Belanja Berhadiah             ");
        System.out.println("      Khusus Pembelian 5 Barang Pertama        ");
        System.out.println("       Dengan harga minimum Rp 10000,00         ");
        System.out.println("------------------------------------------------");
        
        // Input nama pembeli
        System.out.print("Masukkan nama pembeli : ");
        String nama = input.nextLine();
        
        System.out.printf("%n");
        
        // Input harga barang
        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan harga barang ke-" + i + " : ");
            int harga = input.nextInt();
            total += harga;
        }
        
        // Print total
        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp " + total);
        System.out.println("Selamat....");
        
        // Cek hadiah
        if (total >= 100000) {
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        }
        
        // Print footer
        System.out.println("------------------------------------------------");
        System.out.println("                 Terima Kasih                   ");
        System.out.println("    Anda sudah belanja di Kharisma Agung Plaza ");
        
        input.close();
    }
    
}
