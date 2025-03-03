/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author LENOVO
 */
public class Animal1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();

        Dog dog = new Dog();
        dog.makeNoise();

        Animal animalDog = new Dog();
        animalDog.makeNoise();

        if (animal instanceof Animal)
            System.out.println("animal is Animal");

        if (dog instanceof Animal)
            System.out.println("dog is Animal");

        if (animalDog instanceof Animal)
            System.out.println("animalDog is Animal");

        if (animal instanceof Dog)
            System.out.println("animal is Dog");
    }
}

class Animal {
    public void makeNoise() {
        System.out.println("Talk");
    }
}

class Dog extends Animal {
    public void makeNoise() {
        System.out.println("Bark");
    }
}