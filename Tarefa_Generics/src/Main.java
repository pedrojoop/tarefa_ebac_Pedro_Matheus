import Car.Car;
import Car.CarBrands;
import Car.Ford;
import Car.Honda;

import java.util.Scanner;

/**
 * @author pmpedrolima@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        // Instanciar as marcas
        CarBrands<Ford> ford = new CarBrands<>("Ford");
        CarBrands<Honda> honda = new CarBrands<>("Honda");

        // Instanciar carros e adicioná-los às marcas
        Ford fiesta = new Ford("Fiesta");
        Ford sedan = new Ford("Sedan");
        Honda civic = new Honda("Civic");
        Honda fit = new Honda("Fit");

        ford.addCar(fiesta);
        ford.addCar(sedan);
        honda.addCar(civic);
        honda.addCar(fit);

        Scanner scan = new Scanner(System.in);

        // Menu
        System.out.println("Escolha uma opção: ");
        System.out.println("1 = Ford");
        System.out.println("2 = Honda");
        int option = scan.nextInt();

        if (option == 1) {
            System.out.println(ford);
        } else if (option == 2) {
            System.out.println(honda);
        }
    }
}