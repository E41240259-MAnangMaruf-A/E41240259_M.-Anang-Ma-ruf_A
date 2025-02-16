/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prosedurkerja56;

/**
 *
 * @author LENOVO
 */
class book {
    int price;
    int pages;

    public void set(int price, int pages) {
        this.price = price;
        this.pages = pages;
    }

    public void show() {
        System.out.println("Books Information:");
        System.out.println("Books Price: " + price);
        System.out.println("Number of Pages: " + pages);
    }
}

public class ClassObjectMethod {
    public static void main(String[] args) {
        book javabook = new book();
        javabook.set(60000, 100);
        javabook.show();
    }
    
}
