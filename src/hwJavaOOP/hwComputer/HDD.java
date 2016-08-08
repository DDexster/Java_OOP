package hwJavaOOP.hwComputer;

public class HDD extends Device {
    private boolean isIn;

    public HDD() {
    }

    public HDD(String devName, int capacity, int speed) {
        super(devName, capacity, speed);
        this.isIn = true;
    }

    public void turnOn() {
        System.out.println("HDD: Piuuuuuuuuuu");
    }

    public void turnOff() {
        System.out.println("HDD: Piu...cr..cr");
    }

    public void readHDD() {
        System.out.println("HDD: CrCr....CrCr....");
    }

    public void writeHDD() {
        System.out.println("HDD: CrCrCrCrCrCr");
    }

    public String hddInfo() {
        final StringBuilder sb = new StringBuilder("HDD{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
