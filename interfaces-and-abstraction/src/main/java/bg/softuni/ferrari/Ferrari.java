package bg.softuni.ferrari;

import bg.softuni.ferrari.model.Car;
import bg.softuni.ferrari.model.DriveCar;

public class Ferrari implements Car, DriveCar {

    public static final String BRAND = "Ferrari";
    public static final String MODEL_488_SPIDER = "488-Spider";

    private String driver;
    private String model;

    public Ferrari(String driver, String model) {
        this.setDriver(driver);
        this.model = model;
    }

    @Override
    public String useGas() {
        return "Zadu6avam sA!";
    }

    @Override
    public String useBrake() {
        return "Brakes!";
    }

    @Override
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s", this.model, useBrake(), useGas(), this.driver);
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getBrand() {
        return BRAND;
    }
}
