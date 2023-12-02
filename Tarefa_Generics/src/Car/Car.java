package Car;

/**
 * @author pmpedrolima@gmail.com
 */
public abstract class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model;
    }
}
