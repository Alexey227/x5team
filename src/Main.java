public class Main {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Кости", "Двор частного дома");
        animals[1] = new Cat("Молоко", "Квартира");
        animals[2] = new Horse("Сено", "Ферма");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}