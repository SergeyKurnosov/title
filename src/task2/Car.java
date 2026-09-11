package task2;

public class Car extends Venicle{
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                "speed='" + getSpeed() + '\'' +
                '}';
    }
}
