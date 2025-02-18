/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu31112;

/**
 *
 * @author LENOVO
 */
public class ArrayNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Deklarasi dan inisialisasi array
        String[] namaBagian = {"Muhammad", "Anang", "Ma'ruf"};
        
        // Menampilkan elemen array
        System.out.println("Bagian-bagian nama:");
        for(int i = 0; i < namaBagian.length; i++) {
            System.out.println("Bagian ke-" + (i+1) + ": " + namaBagian[i]);
        }
        
        // Menggabungkan nama menjadi satu
        String namaLengkap = "";
        for(int i = 0; i < namaBagian.length; i++) {
            namaLengkap += namaBagian[i];
            if(i < namaBagian.length - 1) {
                namaLengkap += " ";
            }
        }
        
        // Menampilkan hasil penggabungan
        System.out.println("\nNama lengkap:");
        System.out.println(namaLengkap);
    }
    
}