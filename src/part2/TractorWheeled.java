package part2;

public class TractorWheeled extends Tractor{
    public TractorWheeled(String name, int weight, int maxSpeed, int passengers, String type)
    {
        super(name, weight, maxSpeed, passengers, type);
    }

    @Override
    void managePassengers() {
        System.out.println("TractorWheeled have passengers - " + passengers);
    }
}
