/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ashin
 */
public class OptimizingRabbit extends Rabbit {
    private double practiceEffect; // Factor by which speed improves after practicing

    // Constructor
    public OptimizingRabbit(String name, int age, double speed, double practiceEffect) {
        super(name, age, speed);
        this.practiceEffect = practiceEffect;
    }

    // Method to simulate practice and increase speed
    public void practice() {
        double newSpeed = getSpeed() * practiceEffect;
        setSpeed(newSpeed);
        System.out.println(getName() + " practiced and improved speed to " + newSpeed + " m/s!");
    }

    public static void main(String[] args) {
        OptimizingRabbit optRabbit = new OptimizingRabbit("Speedy", 2, 4.5, 1.2);
        optRabbit.displayRabbitDetails();  // From the Rabbit class
        optRabbit.run();                   // Before practice
        
        // Optimize the rabbit's speed by practicing
        optRabbit.practice();
        optRabbit.run();                   // After practice
    }
}
