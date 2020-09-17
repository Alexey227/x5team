package Lesson4Task2;

public class SportCar extends Car {
    String topSpeed;

    public SportCar(Engine engine, String brand, String classAuto, int weight, String topSpeed) {
        super(brand, classAuto, weight, engine);
        this.topSpeed = topSpeed;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    public void printInfo() {
        System.out.println(this.toString());
    }

    public String toString() {
        return "SportCar " + "topSpeed=" + topSpeed + super.toString() + " ";
    }

}
