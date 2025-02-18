/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu3acara910;

/**
 *
 * @author LENOVO
 */
public class Minggu3Acara910 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Deklarasi variabel
        int bilangan = 1;
        
        // Tampilkan judul
        System.out.println("Do_While");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("==========================");
        
        // Proses perulangan dengan do-while
        do {
            System.out.print(bilangan + " ");
            bilangan = bilangan * 2;
        } while (bilangan <= 100);
        
        // Tampilkan baris baru di akhir
        System.out.println();
    }
    
}
