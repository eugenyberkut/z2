package z2.logic;

/**
 * Created by Yevhen on 02.02.2016.
 */
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Mew");
    }
}
