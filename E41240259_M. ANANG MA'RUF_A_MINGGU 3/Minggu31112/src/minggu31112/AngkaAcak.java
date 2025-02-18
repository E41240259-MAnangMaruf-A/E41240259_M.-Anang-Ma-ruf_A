/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu31112;

/**
 *
 * @author LENOVO
 */
import java.util.Random;
import java.util.Scanner;

public class AngkaAcak {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        
        // Membuat objek Random untuk menghasilkan angka acak
        Random random = new Random();
        
        // Mengisi array dengan angka acak
        for (int i = 0; i < n; i++) {
            // Menghasilkan angka acak antara 0 - 100
            array[i] = random.nextInt(101);
        }
        
        // Menampilkan isi array
        System.out.println("Isi array acak:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        
        scanner.close();
    }
}
