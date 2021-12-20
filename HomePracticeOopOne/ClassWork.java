package HomePracticeOop;

public class ClassWork {
    public static void main(String[] args) {
/*        Cat cat1 = new Cat();
        cat1.name = "Murzik";
        cat1.color = "white";
        cat1.age = 4;

        System.out.println(cat1);
        System.out.println(cat1.name);
        System.out.println(cat1.color);
        System.out.println(cat1.age);*/

        Cat cat2 = new Cat("Barsik", "black", 2);
/*        cat2.setName("Biba");
        cat2.setName("Barsik");
        cat2.setColor("gray");*/
        //System.out.println(cat2.getName());
        //System.out.println(cat2.getColor());


        //new Cat("Vaska", "red", 4).run();

        //cat1.run();
        //cat1.voice();

        cat2.run();
        cat2.voice();
        System.out.println(cat2.toString());


    }
}
