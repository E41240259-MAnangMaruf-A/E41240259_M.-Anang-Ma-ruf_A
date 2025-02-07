/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sidekstopminggu1;

/**
 *
 * @author LENOVO
 */
public class SIDekstopMinggu1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        // Mencetak judul Program 
        System.out.println("===== PROGRAM MENCETAK DERET ANGKA GANJIL DARI 5 SAMPAI 15 ===== ");
        
        // Deklarasi dan inisialisasi variabel 
        int angka = 5;
        
        // Menggunakan perulangan while 
        while (angka <= 15) {
            // Mengecek apakah angka adalah bilangan ganjil
            if (angka % 2 != 0){
                // Mencetak angka ganjil
                System.out.println(angka + " adalah angka ganjil");
            }
            // Menambah angka untuk melanjutkan ke angka berikutnya
            angka++;
        }
    }
    
}
