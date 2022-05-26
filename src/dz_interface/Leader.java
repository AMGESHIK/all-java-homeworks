package dz_interface;

public class Leader extends Engineer{
    @Override
    public void who(String name) {
        this.name=name;
        System.out.println(name+" says: I am leader");
    }

}
