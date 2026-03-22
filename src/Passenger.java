public class Passenger {
    private String name;
    private int passengerId;

    public Passenger(String name, int passengerId) {
        this.name = name;
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public int getPassengerId() {
        return passengerId;
    }
}