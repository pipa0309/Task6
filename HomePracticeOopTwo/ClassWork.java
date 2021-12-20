package HomeTaskSeven;

public class ClassWork {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("b", 100),
                new Cat("m", 150),
                new Cat("zh", 300),
        };

        Bowl bowl = new Bowl();

        bowl.putFood(600);

        for (int i = 0; i < cats.length; i++) {

            cats[i].eating(bowl);
        }


    }
}
