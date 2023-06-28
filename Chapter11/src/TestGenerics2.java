import java.util.List;

public class TestGenerics2 {
    public static void main(String[] args) {
        new TestGenerics2().go();
    }

    public void go() {
        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        takeAnimals(animals);

        List<Dog> dogs = List.of(new Dog(), new Dog());
        takeAnimals(dogs);
    }

    public static void takeAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }


    // public static void takeAnimals(List<Animal> animals) {
    //     for (Animal a : animals) {
    //         a.eat();
    //     }
    // }
}
