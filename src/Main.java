public class Main {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane();

        Airplane plane2;
        Airplane plane3;

        plane2 = plane1;

        plane3 = new Airplane();

        plane1.takeOff();

        plane1.land();

        System.out.println(plane1.hasLanded());

        plane2.land();

        System.out.println(plane1.hasLanded());

    }
}
