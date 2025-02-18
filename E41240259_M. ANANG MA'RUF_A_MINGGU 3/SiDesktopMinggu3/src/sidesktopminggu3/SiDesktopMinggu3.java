/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sidesktopminggu3;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class SiDesktopMinggu3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek Scanner untuk mendapatkan input dari keyboard
        Scanner input = new Scanner(System.in);
        
        // Meminta user memasukkan batas awal
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        
        // Meminta user memasukkan batas akhir
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();
        
        System.out.println("Bilangan genap dari " + batasAwal + " sampai " + batasAkhir + " adalah:");
        
        // Jika batas awal ganjil, tambahkan 1 untuk mendapatkan bilangan genap pertama
        if (batasAwal % 2 != 0) {
            batasAwal++;
        }
        
        // Perulangan FOR untuk menampilkan bilangan genap
        for (int i = batasAwal; i <= batasAkhir; i += 2) {
            System.out.print(i + " ");
        }
        
        // Menutup scanner
        input.close();
    
    }
    
}
