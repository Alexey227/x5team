package HomeWork4.task2;

public class Lorry extends Car {
    private String liftingСapacity;

    public Lorry(String liftingСapacity, Engine engine, String brand, String classAuto, int weight) {
        super(brand, classAuto, weight, engine);
        this.liftingСapacity = liftingСapacity;
    }


    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    public void printInfo() {
        System.out.println(this.toString());
    }

    public String toString() {
        return "Lorry " + "liftingСapacity=" + liftingСapacity + super.toString() + ' ';
    }
}
