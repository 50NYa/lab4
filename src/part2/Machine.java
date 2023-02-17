package part2;

public abstract class Machine implements Run{
    static String name;
    int weight;
    int maxSpeed;
    int passengers;

    public Machine(String name, int weight, int maxSpeed, int passengers)
    {
        this.name = name;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.passengers = passengers;
    }

    public String getNameVehicle()
    {
        return name;
    }
    public int getMaxSpeedVehicle()
    {
        return maxSpeed;
    }
    public int getWeightVehicle()
    {
        return weight;
    }
    public static void move(int id)
    {
        System.out.println("Machine " + name + " moved.  ");
    }

    abstract void managePassengers();
}

