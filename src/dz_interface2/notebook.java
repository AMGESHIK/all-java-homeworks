package dz_interface2;

public abstract class notebook implements Paper {
    String name;

    public void sign(String name) {
        this.name = name;
        System.out.println("This is " + name + "'s notebook");
    }
    public abstract void draw(String drawing);
}
