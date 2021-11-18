package HomeTaskSix;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void run(int length) {
        if (length <= 500) {
            System.out.printf("%s run " + length + " m!!!\n", name);
        } else {
            System.out.printf("%s tired of running\n", name);
        }
    }

    public void swim(int lengthPath) {
        if (lengthPath <= 10) {
            System.out.printf("%s swam " + lengthPath + " m!!!\n", name);
        } else {
            System.out.printf("%s tired of swimming\n", name);
        }
    }
}
