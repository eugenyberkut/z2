package z2;

import z2.logic.Animal;
import z2.logic.Cat;
import z2.logic.Dog;
import z2.logic.Pig;

/**
 * Created by Yevhen on 02.02.2016.
 */
public class Main {
    public static void main(String[] args) {
//        new Main().run();
        Main main = new Main();
        main.run();
    }

    private void run() {
        Animal dog = new Dog("Tuzik");
        System.out.println(dog.getName());
        dog.voice();
        Animal cat = new Cat("Murka");
        cat.voice();
        System.out.println(cat.getName());
        dog.setAge(1);
        cat.setAge(5);
        Animal[] animals = {dog, cat, new Pig("Qwe")};
        animals[2].setAge(3);
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getName() + " " + animals[i].getAge());
        }
    }
}
