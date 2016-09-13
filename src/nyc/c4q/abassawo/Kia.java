package nyc.c4q.abassawo;

/**
 * Created by leighdouglas on 9/12/16.
 */
public class Kia extends AbstractCar {

    private int licensePlate;

    public Kia(int licensePlate){
        this.licensePlate = licensePlate;
    }

    @Override
    public void airConditioning() {
        System.out.println("the air conditioning is on");
    }


}
