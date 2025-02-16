/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prosedurkerja78;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class SwitchCase {
    // Membuat Variabel dan scanner
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);

        // Mengambil input
        System.out.print("Inputkan nama warna : ");
        lampu = scan.nextLine();
        
        switch(lampu) {
            case "merah":
                System.out.println("Lampu merah, berhenti");
                break;
            case "kuning":
                System.out.println("Lampu kuuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan");
                break;
            default :
                System.out.println("Warna lampu salah!");
        } 
        
    }  
}
