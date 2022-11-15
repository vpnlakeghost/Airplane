public class Airplane {

    private int id;

    private boolean landed;

    public void takeOff() {
        landed = false;
    }

    public void land() {
        landed = true;
    }

    public boolean hasLanded() {
        return landed;
    }
}
