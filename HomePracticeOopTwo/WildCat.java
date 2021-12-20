package HomePracticeOopTwo;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.printf("Name: %s age: %d fast run on paws\n", name, getAge());
    }

    @Override
    public void voice() {
        System.out.printf("Name: %s age: %d voice meaww\n", name, getAge());
    }

    @Override
    public void hunting() {
        super.hunting();
    }

}
