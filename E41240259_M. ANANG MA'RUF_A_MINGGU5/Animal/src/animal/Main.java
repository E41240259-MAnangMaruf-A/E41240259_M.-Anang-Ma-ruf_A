/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Animal
        Animal animal = new Animal();
        animal.makeNoise(); // Output: Talk

        // Membuat objek Dog
        Dog dog = new Dog();
        dog.makeNoise(); // Output: Bark

        // Polymorphism: object Dog bertipe Animal
        Animal animaldog = new Dog();
        animaldog.makeNoise(); // Output: Bark

        // instanceof untuk mengecek tipe object
        if (animal instanceof Animal) {
            System.out.println("animal is Animal"); 
        }

        if (dog instanceof Animal) {
            System.out.println("dog is Animal"); 
        }

        if (animaldog instanceof Animal) {
            System.out.println("animaldog is Animal"); 
        }

        if (animal instanceof Dog) {
            System.out.println("animal is Dog"); 
        }
    }
}
