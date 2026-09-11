package task2;

public class Venicle {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed < 0){
            System.out.println("Скорость не может быть отрицательной");
        }
        else {
            System.out.println("setSpeed вызывается из класса Venicle");
            this.speed = speed;
        }

    }
}
