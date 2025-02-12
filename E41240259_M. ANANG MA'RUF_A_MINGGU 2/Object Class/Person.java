/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Minggu2_SIDesktop;

/**
 *
 * @author LENOVO
 */
public class Person {
    // Atribut
    private String name;
    private int age;

    // Konstruktor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Metode getter untuk name
    public String getName() {
        return name;
    }

    // Metode getter untuk age
    public int getAge() {
        return age;
    }

    // Metode setter untuk age
    public void setAge(int newAge) {
        this.age = newAge;
    }
}

