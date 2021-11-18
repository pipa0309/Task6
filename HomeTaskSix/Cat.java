package HomeTaskSix;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void run(int lengthPath) {
        if (lengthPath <= 200) {
            System.out.printf("%s run " + lengthPath + " m!!!\n", name);
        } else {
            System.out.printf("%s tired of running\n", name);
        }
    }

    public void swim(int lengthPath) {
        if (lengthPath > 0) {
            System.out.printf("%s can't swim !!!\n", name);
        }
    }
}
