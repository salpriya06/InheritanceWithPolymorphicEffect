public class Car extends Vehicle{

    private String color;

    private byte fueltype;
    private String fueltype1;
    private int noOfGears;

    public Car(String passingNo, String manufacturer, String color, int fueltype, int noOfGears) {
        super(passingNo, manufacturer);
        this.color = color;

        if(fueltype == 1){
            this.fueltype = (byte)fueltype;
            this.fueltype1 = "Petrol";
        } else if (fueltype == 2) {
            this.fueltype = (byte)fueltype;
            this.fueltype1 = "Diesel";
        }


        this.noOfGears = noOfGears;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" Car Passing Number : " + getPassingNo() + '/' +
                " Car Manufacturer : " + getManufacturer() + '/' +
                " Car Colour : " + color + '/' +
                " Car Fuel Type : " + fueltype1 + " Number of Gears : " + noOfGears);
    }

    @Override
    public void start() {
        System.out.println(" Start the car ");
    }

    @Override
    public void move()
    {
//
        System.out.println(" Move the car to left side ");
    }
//
    @Override
    public void stop() {
        System.out.println(" Stop the car ");
    }
}
