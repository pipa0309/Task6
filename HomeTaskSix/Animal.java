package HomeTaskSix;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int lengthPath) {
        System.out.printf("%s run " + lengthPath + " m!!!\n", name);
    }

    public void swim(int lengthPath) {
        System.out.printf("%s swam " + lengthPath + " m!!!\n", name);
    }
}
