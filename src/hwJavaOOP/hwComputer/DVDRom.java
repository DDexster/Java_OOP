package hwJavaOOP.hwComputer;

public class DVDRom extends Device {

    private boolean isIn;

    public DVDRom() {
    }

    public DVDRom(String devName, int capacity, int speed) {
        super(devName, capacity, speed);
        this.isIn = true;
    }

    public void openBay() {
        System.out.println("DVDRom: Bzhzhzhzhzh");
        System.out.println("DVDRom: Drive bay is opened");
    }

    public void closeBay() {
        System.out.println("DVDRom: Bzhzhzhzhzh");
        System.out.println("DVDRom: Drive bay is closed");
    }

    public void turnOn() {
        System.out.println("DVDRom: Uuuuuuuuuuuu");
    }

    public void turnOff() {
        System.out.println("DVDRom: uuuuuuuu.....UU..cr");
    }

    public void readDVD() {
        this.closeBay();
        System.out.println("DVDRom: Uuuuuu.....CrCr....CrCr....");
    }

    public void writeDVD() {
        this.closeBay();
        System.out.println("DVDRom: CrUUUUUCrUUUUUCrUUUUCr");
    }

    public void virusCheck() throws InterruptedException {
        this.closeBay();
        if (this.isIn) {
            super.virusCheck();
        } else {
            System.out.println("Please input the Disk");
            this.openBay();
        }
    }

    public String dvdInfo() {
        final StringBuilder sb = new StringBuilder("DVDRom{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
