package task_1;

public record Temperature(double celsius) {


    public Temperature {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("абсолютный ноль — ниже физически невозможно");
        }
    }

    public double toFahrenheit() {
        return celsius * ((double) 9 / 5) + 32;
    }
}
