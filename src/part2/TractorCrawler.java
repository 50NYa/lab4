package part2;

public class TractorCrawler extends Tractor{

    public TractorCrawler(String name, int weight, int maxSpeed, int passengers, String type) {
        super(name, weight, maxSpeed, passengers, type);
    }

    @Override
    void managePassengers() {
        System.out.println("TractorCrawler have passengers - " + passengers);
    }
}
