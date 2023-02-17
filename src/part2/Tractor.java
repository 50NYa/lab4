package part2;

public abstract class Tractor extends Machine{
    String type;
    public Tractor(String name, int weight, int maxSpeed, int passengers, String type)
    {
        super(name, weight, maxSpeed, passengers);
        this.type = type;
    }
    public void getTractorType(){
        System.out.println("Tractor - " + type + ".");
    }
}

