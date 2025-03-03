/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisan;

/**
 *
 * @author LENOVO
 */
public class Demo {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        
        System.out.println("Superclass");
        superOb.x = 10;
        superOb.y = 20;
        superOb.tampilkanNIlaiXY();
        
        System.out.println("Subclass");
        subOb.x = 5;
        subOb.y = 4;
        subOb.tampilkanNIlaiXY();
        
        // member tambahan yang hanya ada pada subclass
        subOb.z = 50;
        subOb.tampilkanJumlah();
    }
    
}
