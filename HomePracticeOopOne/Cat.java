package HomePracticeOop;

import java.time.Year;

public class Cat {
    private String name;
    private String color;
    private int birthYear;

    public Cat(String name, String color, int age) {
        this(color);
        this.name = name;
        this.birthYear = Year.now().getValue() - age;
    }

    @Override
    public String toString() {
        return String.format("Cat %s\ncolor %s\nage %d\n", name, color, getAge());
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }


    public Cat() {
        System.out.println("Cat born!");
    }

    public Cat(String color) {
        this();
        this.color = color;
    }

    public String getName() {
        return this.name;
    }
 
    public String getColor() {
        return this.color;
    }

    public void setName(String name) {
        this.name = name;
    }

     public void setColor(String color) {
        this.color = color;
    }

    public void run() {
        System.out.printf("%s %s-colored run!\n", name, color);
    }

    public void voice() {
        System.out.printf("%s %s meaww\n", name, color);
    }
}
