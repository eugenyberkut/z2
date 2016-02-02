package z2.logic;

/**
 * Created by Yevhen on 02.02.2016.
 */
public class Pig extends Animal {
    public Pig(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("qaz");
    }

}
