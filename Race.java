package Cars;

import java.util.Scanner;

public class Race {

    public static void main(String[] args) {
    	
        Specs bilalsCar = new Specs("Toyota", "Supra", 1998, "2JZ-GTE", 900);
        Specs drewsCar = new Specs("Mitsubishi", "Eclipse", 1995, "4G63", 600);
        Specs andraysCar = new Specs("BMW", "M335i", 2016, "N55", 620);
        Specs mohammadsCar = new Specs("Tesla", "Model 3", 2021, "Electric", 450);
        Specs robertosCar = new Specs("Nissan", "GTR", 2001, "RB26-DETT", 1000);
        Specs nabeelsCar = new Specs("Dodge", "Viper ACR", 2016, "EWE", 645);
        Specs tylersCar = new Specs("Corvette", "Z06", 2010, "LS7", 505);
        Specs syedsCar = new Specs("Mazda", "Miata", 2016, "Skyactive-G", 155);

        
        Specs[] cars = {bilalsCar, drewsCar, andraysCar, mohammadsCar, robertosCar,
                        nabeelsCar, tylersCar, syedsCar};

        System.out.println("Available cars:");

        for (int i = 0; i < cars.length; i++) {
        	
            System.out.println((i + 1) + ". " + cars[i].getMake() + " " + cars[i].getModel());
        }

        // Get user input to select two cars
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose the first car (1 to " + cars.length + "): ");
        int firstChoice = scanner.nextInt() - 1; // Subtract 1 for zero-based index
        System.out.print("Choose the second car (1 to " + cars.length + "): ");
        int secondChoice = scanner.nextInt() - 1; // Subtract 1 for zero-based index

        // Start the race between the selected cars
        Race race = new Race();
        race.startRace(cars[firstChoice], cars[secondChoice]);

        scanner.close();
    }

    public void startRace(Specs car1, Specs car2) {
    	
        System.out.println("Car 1: ");
        System.out.println();
        car1.displayCarInfo();
        System.out.println();
        System.out.println("Car 2: ");
        car2.displayCarInfo();
        System.out.println();

        if (car1.getHorsepower() > car2.getHorsepower()) {
            System.out.println("The winner is: " + car1.getMake() + " " + car1.getModel());
        } else if (car1.getHorsepower() < car2.getHorsepower()) {
            System.out.println("The winner is: " + car2.getMake() + " " + car2.getModel());
        } else {
            System.out.println("It's a tie!");
        }
    }
}
