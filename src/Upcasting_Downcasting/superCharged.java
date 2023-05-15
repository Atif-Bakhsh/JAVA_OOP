package Upcasting_Downcasting;

public class superCharged extends Ride {
    public superCharged() {
        super();
    }

    @Override
    public void carNoise() {
//        super.carNoise();
        System.out.println("Whine");
    }
}
