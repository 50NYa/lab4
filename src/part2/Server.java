package part2;

import part1.Vehicle;

public class Server {
    private int[] countVehicles;
    private int commonCountVehicles = 1;
    private int limitVehicle;
    private Machine[] vehicles;

    public Server(int size){
        countVehicles = new int[size];
        limitVehicle=size;
        vehicles = new Machine[limitVehicle];
    }

    public int getLimitVehicle () {
        return limitVehicle;
    }

    public int getCurrentCountVehicle () {
        return commonCountVehicles;
    }

    public void addTransport (int numberVehicles, Machine vehicle) {
        System.out.println("Vehicle - " + getCurrentCountVehicle());
        countVehicles[numberVehicles]++;
        commonCountVehicles ++;
        vehicles [numberVehicles] = vehicle;
        Machine.move(countVehicles[numberVehicles]);
    }

}

