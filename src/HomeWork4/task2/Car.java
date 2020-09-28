package HomeWork4.task2;

public abstract class Car {
    private String brand;
    private String classAuto;
    private int weight;
    private Engine engine;

    public Car(String brand, String classAuto, int weight, Engine engine) {
        this.brand = brand;
        this.classAuto = classAuto;
        this.weight = weight;
        this.engine = engine;
    }

    public abstract void start();

    public abstract void stop();

    public void turnLeft() {
        System.out.println("Поворот на лево");
    }

    public void turnRight() {
        System.out.println("Поворот на право");
    }

    public abstract void printInfo();

    public String toString() {
        return "Car " + "brand='" + brand + '\'' + ", classAuto='" + classAuto + '\'' + ", weight=" + weight + ", engine=" + engine + ' ';
    }

}
