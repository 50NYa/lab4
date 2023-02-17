import part1.*;

public class Main {
    public static void main(String[] args)
    {
        Server server = new Server(10);
        for (int i = 0; i < server.getLimitVehicle(); i++)
        {
            Vehicle vehicle_main;
            int random = (int)(1 + Math.random() * 3.5);
            switch(random)
            {
                case 1: vehicle_main = new Car(); break;
                case 2: vehicle_main = new Bicycle(); break;
                case 3: vehicle_main = new Jumpers(); break;
                case 4: vehicle_main = new RollerSkates(); break;
                default: vehicle_main = null; break;
            }
            server.addTransport(random, vehicle_main);
        }
    }
}
