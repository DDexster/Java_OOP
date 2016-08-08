package hwJavaOOP.hwComputer;

import java.util.ArrayList;

public class CPU {
    private ArrayList<Core> cpu = new ArrayList<>();

    public CPU() {
    }

    public CPU(ArrayList<Core> cpu) {
        this.cpu = cpu;
    }

    public void turnOn() {
        System.out.println("CPU is turning on!");
    }

    public void turnOff() {
        System.out.println("CPU is turning off!");
    }


    public CPU addCore(int n, Core core) {
        for (int i = 0; i < n; i++) {
            this.cpu.add(core);
        }
        return this;
    }

    public CPU removeCore(int n) {
        for (int i = 0; i < n; i++) this.cpu.remove(0);
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CPU{");
        sb.append("cpu=").append(cpu.size()).append(" cores of ")
                .append(this.cpu.get(0)).append('}');
        return sb.toString();
    }
}
