package dz_interface;

public class Engineer implements Employee{
    public String name, profession="engineer";

    public void who(String name) {
        this.name=name;
        System.out.println(name+" says: I am engineer");
    }

}
