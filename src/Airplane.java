public class Airplane {

    private int id;

    private boolean landed;

    public void takeOff() {
        landed = false;
    }

    public void landed() {
        landed = true;
    }
}
