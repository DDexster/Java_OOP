package hwJavaOOP.hwComputer;

public class Device {
    private String devName;
    private int capacity;
    private int speed;

    public Device() {
    }

    public Device(String devName, int capacity, int speed) {
        this.devName = devName;
        this.capacity = capacity;
        this.speed = speed;
    }

    public void turnOn() {
        System.out.println(devName + ": Turning on!");
    }

    public void turnOff() {
        System.out.println(devName + ": Turning off!");
    }

    public void read() throws InterruptedException {

        System.out.println("Reading...");
        Thread.sleep(3000);
        System.out.println("Read OK!");
    }

    public void write() throws InterruptedException {

        System.out.println("Writing...");
        Thread.sleep(3000);
        System.out.println("Write OK!");
    }

    public void virusCheck() throws InterruptedException {
        System.out.println(devName + ": Starting virus check");
        Thread.sleep((this.getCapacity() / this.getSpeed()) * 1000);
        System.out.println("Device is OK!");
    }

    public String getDevName() {
        return devName;
    }

    public Device setDevName(String devName) {
        this.devName = devName;
        return this;
    }

    public int getCapacity() {
        return capacity;
    }

    public Device setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public int getSpeed() {
        return speed;
    }

    public Device setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Device{");
        sb.append("devName='").append(devName).append('\'');
        sb.append(", capacity=").append(capacity);
        sb.append(", speed=").append(speed);
        sb.append('}');
        return sb.toString();
    }
}
