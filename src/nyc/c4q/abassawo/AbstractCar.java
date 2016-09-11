package nyc.c4q.abassawo;

/**
 * Created by Abass
 *
 * Abstract class containing both bstract methods and concrete methods.
 */
public abstract class AbstractCar {

    public void fuel(){
        System.out.println("Fueling up");
    }

    public void brake(){
        System.out.println("Applying brakes");
    }

    public abstract void airConditioning();
}
