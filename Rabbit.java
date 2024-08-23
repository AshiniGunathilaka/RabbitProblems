/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ashin
 */
public class Rabbit {

    /**
     * @param args the command line arguments
     */
  
    private String name;
    private int age;
    private double speed; // Speed in meters per second

    // Constructor
    public Rabbit(String name, int age, double speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSpeed() {
        return speed;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // Method to simulate running
    public void run() {
        System.out.println(name + " is running at " + speed + " meters per second!");
    }

    // Method to display rabbit details
    public void displayRabbitDetails() {
        System.out.println("Rabbit Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Speed: " + speed + " m/s");
    }

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Fluffy", 3, 5.2);
        rabbit.displayRabbitDetails();
        rabbit.run();
    }
}
