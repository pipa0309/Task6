package HomeTaskSeven;

public class WorkClass {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Vasya", 8, false),
                new Cat("Barsik", 13, false),
                new Cat("Murzik", 10, false),
                new Cat("Zhorik", 22, false),
                new Cat("Pushok", 8, false)
        };

        Plate plate = new Plate(50);


        for (int i = 0; i < cats.length; i++) {
            plate.printInfoPlate();
            cats[i].eat(plate);
        }
    }
}
