public class Bus extends Vehicle{

    private int capacity;

    public Bus(String passingNo, String manufacturer, int capacity) {
        super(passingNo, manufacturer);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" Capacity of Bus : " +capacity);
    }

    @Override
    public void start() {
        System.out.println(" Start the bus ");
    }

    @Override
    public void move() {
        System.out.println(" Move the bus ");
    }

    @Override
    public void stop() {
        System.out.println(" Stop the bus ");
    }
}
