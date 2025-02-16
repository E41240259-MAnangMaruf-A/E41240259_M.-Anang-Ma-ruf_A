/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinfo;

/**
 *
 * @author LENOVO
 */
public class StudentInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi variabel
        String fName = "Lisa";        // Nama depan
        String IName = "Palombo";     // Nama belakang
        String stuId = "123456789";   // ID siswa
        String stuStatus = "Active";  // Status siswa

        // Menampilkan informasi siswa
        String StudentName = fName + " " + IName; 
        System.out.println("===========================================");
        System.out.println("            STUDENT INFORMATIONS         ");
        System.out.println("===========================================");
        System.out.println("Student Name   : " + StudentName);
        System.out.println("Student ID     : " + stuId);
        System.out.println("Student Status : " + stuStatus);
        System.out.println("===========================================");
    }
    
}
