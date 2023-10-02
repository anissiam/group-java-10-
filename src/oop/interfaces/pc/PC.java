package oop.interfaces.pc;

public class PC {
    private int ram;
    private String cpu;
    private String GPU;
    private int storage;

    public PC() {
    }

    public PC(int ram, String cpu, String GPU, int storage) {
        this.ram = ram;
        this.cpu = cpu;
        this.GPU = GPU;
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "PC{" +
                "ram=" + ram +"GB"+
                ", cpu='" + cpu + '\'' +
                ", GPU='" + GPU + '\'' +
                ", storage=" + storage + "TB"+
                '}';
    }
}
