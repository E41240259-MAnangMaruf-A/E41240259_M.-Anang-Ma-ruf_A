/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sidekstop1;

/**
 *
 * @author LENOVO
 */
public class SIDekstop1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        
        String namaMahasiswa,nimMahasiswa,prodiMahasiswa;
        char golonganMahasiswa;
        
        namaMahasiswa = "M.ANANG MA'RUF";
        nimMahasiswa = "E41240259";
        golonganMahasiswa = 'A';
        prodiMahasiswa = "Teknik Informatika";
        
        // terakhir kita cetak (print) data yang sudah di tentukan 
        System.out.println("Nama Mahasiswa     : " + namaMahasiswa); 
        System.out.println("NIM Mahasiswa      : " + nimMahasiswa); 
        System.out.println("Golongan Mahasiswa : " + golonganMahasiswa); 
        System.out.println("Prodi Mahasiswa    : " + prodiMahasiswa);      
        
        System.out.println("===== PROGRAM MENCETAK BILANGAN PRIMA ANTARA 20 HINGGA 50 =====");
        
        // Menggunakan perulangan for
        for (int angka = 20; angka <= 50; angka++){
            // Cek apakah angka tidak habis dibagi 2,3,5 dan 7 (di modulus), jika tidak maka bilangan tersebut adalah prima
            if (angka % 2 != 0 && angka % 3 != 0 && angka % 5 != 0 && angka % 7 != 0){
                // Mencetak bilangan yang termasuk dalam bilangan prima
                System.out.println("Bilangan yang termasuk prima : " + angka);
            }
        }
    }
}
