package Car;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pmpedrolima@gmail.com
 */
public class CarBrands<E extends Car> {
    private String name;
    private List<E> cars;

    public CarBrands(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCar(E car) {
        cars.add(car);
    }

    public List<E> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return name + ": " + cars;
    }
}