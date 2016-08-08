package hwJavaOOP.hwComputer;

public class Core {
    private String name;
    private double frequency;
    private int cacheSize;

    public Core(String name, double frequency, int cacheSize) {
        this.name = name;
        this.frequency = frequency;
        this.cacheSize = cacheSize;
    }

    public String getName() {
        return name;
    }

    public Core setName(String name) {
        this.name = name;
        return this;
    }

    public double getFrequency() {
        return frequency;
    }

    public Core setFrequency(double frequency) {
        this.frequency = frequency;
        return this;
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public Core setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Core{");
        sb.append("name='").append(name).append('\'');
        sb.append(", frequency=").append(frequency);
        sb.append(", cacheSize=").append(cacheSize);
        sb.append('}');
        return sb.toString();
    }
}
