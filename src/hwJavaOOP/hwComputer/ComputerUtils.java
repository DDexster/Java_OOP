package hwJavaOOP.hwComputer;

public class ComputerUtils {
    static Computer createComp() {
        Core core = new Core("intel", 2.5, 8);
        CPU cpu = new CPU();
        cpu.addCore(4, core);

        HDD hdd = new HDD("sda", 5000, 520);

        DVDRom dvdRom = new DVDRom("sdb", 700, 52);

        Ram ram = new Ram("ram", 2000, 2600);

        Computer comp = new Computer("Dex PC", hdd, dvdRom, ram, cpu);
        return comp;
    }
}
