package hwJavaOOP.hwComputer;

public class Computer {

    private String name;
    HDD hdd = new HDD();
    DVDRom dvdRom = new DVDRom();
    Ram ram = new Ram();
    CPU cpu = new CPU();

    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    public Computer(String name, HDD hdd, DVDRom dvdRom, Ram ram, CPU cpu) {
        this.name = name;
        this.hdd = hdd;
        this.dvdRom = dvdRom;
        this.ram = ram;
        this.cpu = cpu;
    }

    public void turnOn() {
        this.cpu.turnOn();
        this.ram.turnOn();
        this.hdd.turnOn();
        this.dvdRom.turnOn();
    }

    public void turnOff() {
        this.dvdRom.turnOff();
        this.hdd.turnOff();
        this.ram.turnOff();
        this.cpu.turnOff();
    }

    public void virusCheck() throws InterruptedException {
        this.hdd.virusCheck();
        this.ram.virusCheck();
        this.dvdRom.virusCheck();
    }

    public String getName() {
        return name;
    }

    public Computer setName(String name) {
        this.name = name;
        return this;
    }

    public HDD getHdd() {
        return hdd;
    }

    public Computer setHdd(HDD hdd) {
        this.hdd = hdd;
        return this;
    }

    public DVDRom getDvdRom() {
        return dvdRom;
    }

    public Computer setDvdRom(DVDRom dvdRom) {
        this.dvdRom = dvdRom;
        return this;
    }

    public Ram getRam() {
        return ram;
    }

    public Computer setRam(Ram ram) {
        this.ram = ram;
        return this;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Computer setCpu(CPU cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("name='").append(name).append('\'');
        sb.append(", hdd=").append(hdd);
        sb.append(", dvdRom=").append(dvdRom);
        sb.append(", ram=").append(ram);
        sb.append(", cpu=").append(cpu);
        sb.append('}');
        return sb.toString();
    }


}
