/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kharismaplaza;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class CafeCeria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Header cafe
        System.out.println("        CAFE CERIA        ");
        System.out.println("      ANEKA MINUMAN       ");
        System.out.println("========================= ");
        System.out.println("      SPECIAL MENU :      ");
        System.out.println("    1. Soft drinks        ");
        System.out.println("    2. Mix juice          ");
        System.out.println("    3. Nescafe            ");
        System.out.println("    4. Soda milk          ");
        System.out.println("    5. Tea                ");
        System.out.println("========================= ");
        
        // Input nama pembeli
        System.out.print("Masukkan nama pembeli : ");
        String nama = input.nextLine();
        
        System.out.printf("%n");
        // Input pilihan menu
        System.out.print("Silahkan masukkan pilihan anda : ");
        int pilihan = input.nextInt();
        
        // Proses pilihan menggunakan switch case
        String minuman = "";
        switch(pilihan) {
            case 1:
                minuman = "Soft drinks";
                break;
            case 2:
                minuman = "Mix juice";
                break;
            case 3:
                minuman = "Nescafe";
                break;
            case 4:
                minuman = "Soda milk";
                break;
            case 5:
                minuman = "Tea";
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }
        
        // Output pesanan
        System.out.println("Minuman yang anda pesan adalah " + minuman);
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima kasih " + nama + " telah berkunjung diCafe Ceria");
        
        input.close();
    }
    
}
