package HomePracticeOopTwo;

import java.time.Year;

public class Cat {
    private String name;
    private int birthYear;

    public Cat() {
        System.out.println("Cat born\n");
    }

    public Cat(String name, int birthYear) {
        this();
        this.name = name;
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    @Override
    public String toString() {
        String result = String.format("Cat %s with age %d\n", this.name, getAge());
        System.out.println(result);
        return result;
    }
}
