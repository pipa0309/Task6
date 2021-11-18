//forCheck
package HomeTaskSix;

public class HomeWorkAppSix {
    public static void main(String[] args) {
        final int lengthPath = 600;

        Animal[] animals = createArrayAnimals();
        runAndSwimAnimals(lengthPath, animals);
        counterAnimals(animals);
    }

    private static Animal[] createArrayAnimals() {
        Animal[] animals = {
                new Cat("Murzik"),
                new Dog("Sharik"),
                new Cat("Vaska"),
                new Dog("Bobik")
        };
        return animals;
    }

    private static void runAndSwimAnimals(int lengthPath, Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) {
                animals[i].run(lengthPath);
                animals[i].swim(lengthPath);
            }
            if (animals[i] instanceof Dog) {
                animals[i].run(lengthPath);
                animals[i].swim(lengthPath);
            }
        }
    }

    private static void counterAnimals(Animal[] animals) {
        int countCats = 0;
        int countDogs = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) {
                countCats++;
            }
            if (animals[i] instanceof Dog) {
                countDogs++;
            }
        }
        System.out.println("\nnumber of cats = " + countCats + "\nnumber of dogs = " + countDogs);
        System.out.println("\nnumber of all animals = " + (countCats + countDogs));
    }
}
