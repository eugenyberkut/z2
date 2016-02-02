package z2.logic;

/**
 * Created by Yevhen on 02.02.2016.
 */
public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract public void voice();
}
