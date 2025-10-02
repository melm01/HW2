public class Microwave extends Device {
    public int maxTime;

    public Microwave(int startPower, int maxCookingTime) {
        super(startPower);         // calls Device constructor
        this.maxTime = maxCookingTime;
    }
    public void printDescription() {
        super.printDescription(); // use Device's method
        System.out.println("Max time: " + maxTime);
    }

    public void heatFood() {
        System.out.println("Food is heating.");
    }

}