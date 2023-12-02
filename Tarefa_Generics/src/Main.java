import Car.Car;
import Car.CarBrands;

import java.util.Scanner;

/**
 * @author pmpedrolima@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        //Instanciar as marcas
        CarBrands<String> ford = new CarBrands<String>("Ford");
        CarBrands<String> honda = new CarBrands<String>("Honda");

        //Instanciar carros
        Car<String> fiesta = new Car<String>("Fiesta");
        Car<String> sedan = new Car<String>("Sedan");
        Car<String> civic = new Car<String>("Civic");
        Car<String> fit = new Car<String>("Fit");

        //adicionar carros as marcas
        ford.addCar(String.valueOf(fiesta));
        ford.addCar(String.valueOf(sedan));
        honda.addCar(String.valueOf(civic));
        honda.addCar(String.valueOf(fit));

        Scanner scan = new Scanner(System.in);
        
        //menu
        System.out.println("Escolha uma opção: ");
        System.out.println("1 = Ford");
        System.out.println("2 = Honda");
        int option = scan.nextInt();

        if(option == 1) {
            System.out.println(ford);
        } else if (option == 2) {
            System.out.println(honda);
        }
    }
}