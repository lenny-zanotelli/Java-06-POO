import Autoboat.Boat;
import Autoboat.Car;
import Autoboat.Vehicle;

public class Hangar {
    public static void main(String[] args) {
        Vehicle car = new Car("Clio", 120000);
        Vehicle boat = new Boat("Titanic", 1000000);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}